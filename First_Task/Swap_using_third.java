
//Write a program to swap two variables using a third variable.


import java.util.Scanner;

public class Swap_using_third {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of A : ");
         a= sc.nextInt();
        System.out.println("Enter the value of B : ");
         b=sc.nextInt();

        c=a;
        a=b;
        b=c;
        System.out.println("After swaping the value of A : " +a +" and B : " + b);
    }
    
}
