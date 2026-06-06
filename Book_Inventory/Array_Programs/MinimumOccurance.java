package Array_Programs;

import java.util.Scanner;

public class MinimumOccurance {

    public static void count (){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the size of the Array: ");
        int size =sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the values to the array: ");
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }

         int min=size;
        int element=arr[0];
        for(int i=0;i<size;i++){
            int count=0;
            for(int j=0;j<size;j++){
                if(arr[i]==arr[j]){
                count++;
            }
            }
            if(count<min){
                min=count;
                element=arr[i];
            }
        }
           System.out.println("The element  " + element +" has maximum occurance of "+min );
    }
    public static void main(String []args){
        count();
    }
    
}
