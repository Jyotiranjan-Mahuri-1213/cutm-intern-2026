package Array_Programs;

import java.util.Scanner;

public class LastIndex {
    public static void print(){
        Scanner sc =new Scanner (System.in);
        
        System.out.println("Enter the size of the array: ");
        int size =sc.nextInt();
        int []arr=new int [size];
        System.out.println("Enter the values to the Array: ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the element to find last index: ");
        int element=sc.nextInt();
        int lastindex=-1;
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                 lastindex=i;
            }
        }
        if(lastindex!=-1){
            System.out.println("Last position of "+ element +" is " +lastindex );
        }
        else{
            System.out.println("Element not found.");
        }

        }
    public static void main(String []args){
        print();
    }
    
}
