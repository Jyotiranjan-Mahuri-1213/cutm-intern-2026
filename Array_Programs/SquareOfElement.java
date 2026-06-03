package Array_Programs;

import java.util.Scanner;

public class SquareOfElement {
    
    public static void cal(){
        Scanner  sc =new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size =sc.nextInt();
        int []arr=new int [size];
        System.out.println("Enter the values to the array : ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int result=0;
        System.out.println("The square of the element are: ");
        for(int i=0;i<size;i++){
             result=arr[i]*arr[i];
              System.out.println(result);
        }
       

    }
    public static void main(String []args){
        cal();
    }
    
}
