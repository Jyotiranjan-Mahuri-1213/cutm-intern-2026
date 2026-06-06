package Array_Programs;

import java.util.Scanner;

public class FindLargest {
    public static void find(){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int size =sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the values to the array: ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        System.out.println("The largest value is: ");
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            
        }
           System.out.println("Largest element = " + max);
    }
    public static void main(String []args){
        find();
    }
    
}
