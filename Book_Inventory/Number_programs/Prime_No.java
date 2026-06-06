package Number_programs;
//16.	Write a program to check whether a number is a Prime number.
import java.util.Scanner;

public class Prime_No {

    public static void checkPrime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("It is prime.");
        }
        else{
            System.out.println("Not a prime no.");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        checkPrime(num);
    }
    
}
