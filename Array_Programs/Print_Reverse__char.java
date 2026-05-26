package Array_Programs;

import java.util.Scanner;

public class Print_Reverse__char {
public static void reverseString(){
    Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String: ");
           String str=sc.nextLine();
           char []ch=str.toCharArray();
           System.out.println("Reversed characters are: ");
           for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
           }
        }
    public static void main(String [] args){
        reverseString();
        
    }
    
}
