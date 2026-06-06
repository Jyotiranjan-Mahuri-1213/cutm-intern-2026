package Array_Programs;

import java.util.Scanner;

public class FindSmallest {
    public static void find(){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int size =sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the values to the array: ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            
        }
           System.out.println("Smallest element = " + min);
    }
    public static void main(String []args){
        find();
    }
    
}
