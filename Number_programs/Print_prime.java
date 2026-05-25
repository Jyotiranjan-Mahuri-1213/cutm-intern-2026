package Number_programs;

import java.util.Scanner;

public class Print_prime {

    public static void print(int n){
        
            for(int j=2;j<=n;j++){
                int count=0;
                for(int i=1;i<=j;i++){
                    if(j%i==0){
                        count++;
                    
                    }
                }
            if(count==2){
            System.out.println(j);
            }
        }
    }
    public static void main(String [] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter limit to print the prime numbers: ");
     int n=sc.nextInt();
        System.out.println("the prime numbers are: ");
     print(n);   
    }
    
}
