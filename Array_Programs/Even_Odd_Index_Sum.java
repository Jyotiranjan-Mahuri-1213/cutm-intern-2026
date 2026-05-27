package Array_Programs;

import java.util.Scanner;

public class Even_Odd_Index_Sum {

    public static void evenSum(){
        Scanner sc=new Scanner (System.in);
        int sum=0;
        System.out.println("Enter the size of Array: ");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the values to array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The sum of even index values are: ");
        for(int i=0;i<size;i++){
            if(i%2==0){
                sum=sum+arr[i];
            }
        }   
        System.out.println(sum);     
        
    }

    public static void OddSum(){
        Scanner sc=new Scanner (System.in);
        int sum=0;
        System.out.println("Enter the size of Array: ");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the values to array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The sum of odd index values are: ");
        for(int i=0;i<size;i++){
            if(i%2!=0){
                sum=sum+arr[i];
            }
        }   
        System.out.println(sum);     
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Sum of Even Index ");
            System.out.println("2. Sum of Odd Index value ");
            System.out.println("-----------------------------");
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                evenSum();
            break;

            case 2:
             OddSum();
            break;
            
            default:
                System.out.println("Invalide choice");

        }
        
        }
        while(choice!=2);
    }
    
}
