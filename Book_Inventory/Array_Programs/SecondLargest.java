package Array_Programs;

import java.util.Scanner;

public class SecondLargest {

    public static void search(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of the Array: ");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the values to the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int largest =arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>largest){
                largest=arr[i];
                break;
            }
        }
        
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]>secondlargest && arr[i]!=largest){
                secondlargest=arr[i];
            }
        }
        System.out.println("Second largest: "+ secondlargest);
    }
    public static void main(String []args){
        search();
    }
    
}
