package JDBC.Entity.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import JDBC.Entity.Employee;

public class dbemp {

   public int insert(Employee e1) {

    int rows = 0;

    try {

        Connection con = DBConnection.getConnection();

        String sql =
                "INSERT INTO employee VALUES(?,?,?,?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, e1.getId());
        ps.setString(2, e1.getName());
        ps.setString(3, e1.getDob());
        ps.setString(4, e1.getDepartment());
        ps.setString(5, e1.getPhoneNo());
        ps.setString(6, e1.getAccNo());
        ps.setString(7, e1.getSalary());

        rows = ps.executeUpdate();

        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

    return rows;
}

    public boolean deleteById(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM employee WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            con.close();

            return rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public void displayAll() {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM employee";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("dob") + " " +
                    rs.getString("department") + " " +
                    rs.getString("phoneNo") + " " +
                    rs.getString("accNo") + " " +
                    rs.getString("salary")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getByid(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM employee WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("dob") + " " +
                    rs.getString("department") + " " +
                    rs.getString("phoneNo") + " " +
                    rs.getString("accNo") + " " +
                    rs.getString("salary")
                );
            } else {
                System.out.println("Employee not found");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int update(Employee emp) {

        int rows = 0;

        try {
            Connection con = DBConnection.getConnection();

            String sql =
                "UPDATE employee SET name=?,dob=?,department=?,phoneNo=?,accNo=?,salary=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getDob());
            ps.setString(3, emp.getDepartment());
            ps.setString(4, emp.getPhoneNo());
            ps.setString(5, emp.getAccNo());
            ps.setString(6, emp.getSalary());
            ps.setInt(7, emp.getId());

            rows = ps.executeUpdate();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return rows;
    }
}