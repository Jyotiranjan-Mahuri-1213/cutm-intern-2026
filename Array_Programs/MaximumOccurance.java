package Array_Programs;

import java.util.Scanner;

public class MaximumOccurance {

    public static void count(){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int size =sc.nextInt();
        int []arr=new int [size];
        System.out.println("Enter the values to the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       
        
        int max=0;
        int element=arr[0];
        for(int i=0;i<size;i++){
            int count=0;
            for(int j=0;j<size;j++){
                if(arr[i]==arr[j]){
                count++;
            }
            }
            if(count>max){
                max=count;
                element=arr[i];
            }
        }
           System.out.println("The element  " + element +" has maximum occurance of "+max );
          
        
    }
    public static void main(String []args){
        count();
    }
    
}
