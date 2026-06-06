package Number_programs;

import java.util.Scanner;

public class Count_digit {

    public static void countNumber(int num){
        int count=0;
        while(num!=0){
        num=num/10;
        count ++;
        }
        System.out.println("There are "+ count +" digits .");
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num= sc.nextInt();
        countNumber( num);
    }
    
}
