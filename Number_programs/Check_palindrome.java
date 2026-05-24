package Number_programs;
import java .util.*;
public class Check_palindrome {

    public static void checkNum(int num){
        int rev=0,rem;
        int temp=num;
         while(num!=0){
            
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
            
        }
        if(rev==temp){
                System.out.println("Number is pallindrome .");
            }
            else{
                System.out.println("Not a pallindrome number .");
            }

    }
    public static void main(String []args){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        checkNum(num);
    }
    
}
