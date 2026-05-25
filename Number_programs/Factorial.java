package Number_programs;
//19.	Write a program to find the factorial of a number.
import java .util.*;

import java.util.Scanner;

public class Factorial {
    public static void findFactorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial: "+ fact);
    }
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        findFactorial(num);
    }
    
}
