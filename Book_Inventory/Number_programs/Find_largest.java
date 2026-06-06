package Number_programs;
//3.	Write a program to find the largest of three numbers.
import java.util.Scanner;

public class Find_largest {
    public static void check(int num1, int num2 , int num3){
        if (num1>num2&&num1>num3){
            System.out.println("First number "+ num1 +" is greater");
        }
        else if(num2>num1&&num2>num3){
            System.out.println("Second number "+num2 +" is greater");
        }
        else{
            System.out.println("Third number "+num3 +" is greater");
        }
    }
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter second number : ");
        int num2=sc.nextInt();
        System.out.println("Enter third number : ");
        int num3=sc.nextInt();
        check(num1,num2,num3);
    }
    
}
