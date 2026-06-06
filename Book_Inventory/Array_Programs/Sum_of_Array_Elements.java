package Array_Programs;

import java.util.Scanner;

public class Sum_of_Array_Elements {

    public static void sum(){
        Scanner sc=new Scanner (System.in);
        int sum=0;
        System.out.println("Eneter the size of the array: ");
        int size=sc.nextInt();
        int []arr =new int[size];
        System.out.println("Enter the elements to the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The sum of the elements are: ");
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        sum();
    }
    
}
