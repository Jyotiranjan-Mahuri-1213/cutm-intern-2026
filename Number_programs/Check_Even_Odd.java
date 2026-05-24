package Number_programs;
// 1.	Write a program to check whether a number is even or odd.
import java.util.*;
public class Check_Even_Odd {

    public static void checkNum(int num){
        if (num%2==0){
            System.out.println("It is even number.");

        }
        else{
            System.out.println("It is an odd number.");
        }
    }
    public static void main (String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        checkNum(num);

    }
}
