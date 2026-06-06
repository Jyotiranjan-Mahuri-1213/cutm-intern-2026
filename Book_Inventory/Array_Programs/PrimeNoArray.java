package Array_Programs;

import java.util.Scanner;

public class PrimeNoArray {
    public static void printPrime(){
        
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the size of the array: ");
        int size =sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the values to the Array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Prime numbers in the array are: ");
        boolean found = false;
        for(int i=0;i<size;i++){
            int num = arr[i];

            if(num <= 1) {
                continue;
            }

            int count = 0;

            for(int j = 1; j <= num; j++) {

                if(num % j == 0) {
                    count++;
                }
            }

           if(count == 2) {
    System.out.println(num);
    found = true;
}

        }
        if(found == false) {
    System.out.println("No prime numbers found");
}

    }
    public static void main(String []args){
        printPrime();
    }
    
}
