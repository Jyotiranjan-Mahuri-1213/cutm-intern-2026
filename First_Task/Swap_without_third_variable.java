import java.util.Scanner;

public class Swap_without_third_variable {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A : ");
        int a=sc.nextInt();
        System.out.println("Enter the value of B : ");
        int b=sc.nextInt();

        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("After Swapping the value of A: " +a +" and The value of B : " +b);
    } 
    
}
