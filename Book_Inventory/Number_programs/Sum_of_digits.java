package Number_programs;

import java.util.Scanner;

public class Sum_of_digits {
    public static void calculate(int num){
         int sum = 0;

        while (num != 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        calculate(num);
    }
    
}
