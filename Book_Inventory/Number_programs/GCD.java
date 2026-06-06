package Number_programs;
// 20.	Write a program to find the GCD (Greatest Common Divisor) of two numbers.
import java.util.Scanner;

public class GCD {
    public static void findGCD(int a, int b){
        int  gcd=0;
        
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0)
                gcd =i;
        }
    
        System.out.println("GCD: "+ gcd);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        findGCD(a,b);
    }
    
}
