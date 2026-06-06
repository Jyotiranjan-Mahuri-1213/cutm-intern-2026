package Array_Programs;

import java.util.Scanner;

public class InsertEven {
    public static void insert(){
        Scanner sc=new Scanner (System.in);
       
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the even element to the array: ");
         int i=0;
        while(i<size){
            int num =sc.nextInt();
            if(num%2==0){
            arr[i]=num;
            i++;
            }
            else{
                System.out.println("Odd numbers not allowed enter more element: ");
            }
        }
        System.out.println("Elements in the array are : ");
        for(i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String []args){
        insert();
    }
    
}
