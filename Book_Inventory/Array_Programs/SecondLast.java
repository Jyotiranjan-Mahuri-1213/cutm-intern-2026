package Array_Programs;

import java.util.Scanner;

public class SecondLast {

    public static void print(){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of array: ");
        int size =sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the values to the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Second last element: ");
        if(size < 2) {
            System.out.println("Array should contain at least 2 elements");
        } else {
            System.out.println("Second last element is: " + arr[arr.length - 2]);
        }
    }

    public static void main(String[]args){
        print();
    }
    
}
