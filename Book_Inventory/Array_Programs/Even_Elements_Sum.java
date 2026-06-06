package Array_Programs;

import java.util.Scanner;

public class Even_Elements_Sum {
    public static void sumEvenElement(){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the size of the Array: ");
        int size =sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the element to the Array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Sum of even elements of the array are: ");
        
            for(int i=0;i<size;i++){
                if(arr[i]%2==0){
                    sum=sum+arr[i];
                }
            }
            System.out.println(sum);
        
    }


    public static void main(String []args){
        sumEvenElement();
    }
}
    

