package Array_Programs;

import java.util.Scanner;

public class CountOccurance {

    public static void count(){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int size =sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the values to the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the element you want to count: ");
        int count =0;
        int element =sc.nextInt();
        for(int i=0;i <size;i++){
            if( arr[i]==element){
                count++;
            }
        }
        if(count==0){
            System.out.println("element not found !!!!");
        }
        else{
            System.out.println(count +" Times.");
        }
    }
    public static void main(String [] args){
        count();
    }
    
}
