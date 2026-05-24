package Number_programs;
//2.	Write a program to check whether a number is positive, negative, or zero.
import java .util.*;
public class Check_number {
    public static void check(int num){
        if(num<0){
            System.out.println("Negative");

        }
        else if(num>0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Zero");
        }
    }
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        check(num);
    }
    
}
