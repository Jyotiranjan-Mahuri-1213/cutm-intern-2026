package Array_Programs;

import java.util.Scanner;

public class Convertion01 {
    public static void convert(){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int size =sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the values to the array: ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                arr[i] = arr[i]-1;
                }
            else if (arr[i]== -1) {
                arr[i]=  arr[i]+1;
            }
        
        }
         System.out.println("After convertion the element = " );  
         for(int i=0;i<size;i++){
            System.out.println(arr[i]);
         } 
           
    }
    public static void main(String []args){
        convert();
    }
    
}
