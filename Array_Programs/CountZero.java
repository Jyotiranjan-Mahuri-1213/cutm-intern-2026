package Array_Programs;

import java.util.Scanner;

public class CountZero {
    public static void count(){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the size of Array: ");
        int size =sc.nextInt();
        int []arr=new int [size];
        System.out.println("Enter the values to the Array: ");
        for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                count++;
            }
        }
        System.out.println("There are "+count+" zeros");
        

    }
    public static void main(String []args){
        count();
    }
    
}
