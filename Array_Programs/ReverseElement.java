package Array_Programs;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class ReverseElement {
    public static void reverse(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size =sc.nextInt();
        int []arr =new int[size];
        System.out.println("Enter the element to the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("After reverse the Array elements are: ");
        for(int i=0;i<size;i++){
            int num=arr[i];
            int reverse =0;
            while(num!=0){
                 int remender = num % 10;
                reverse = reverse * 10 + remender;
                num = num / 10;
        }
        System.out.println(+ reverse);
            }
            

    }
    public static void main (String []args){
        reverse();
        }
    
}
