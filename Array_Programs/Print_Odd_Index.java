package Array_Programs;

import java.util.Scanner;

public class Print_Odd_Index {

    public static void printOddIndex(){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int size =sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the values to the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The odd index values are: ");
        for(int i=0;i<size;i++){
            if(i%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        printOddIndex();
    }
    
}
