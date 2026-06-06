package Number_programs;
//7.	Write a program to reverse a number.
import java. util.*;
public class Reverse_num {

    public static void reverse(int num){
        int temp=num;
        int rev=0,rem;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("reversed no. is : "+rev);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number : ");
        int num= sc.nextInt();
        reverse(num);
    }
    
}
