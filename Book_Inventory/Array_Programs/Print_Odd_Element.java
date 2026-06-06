package Array_Programs;

import java.util.Scanner;

public class Print_Odd_Element {

    public static void printElement(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the values to the Array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The odd element in array: ");
        for(int i=0;i<size;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String [] args){

        printElement();
    }
    
}
