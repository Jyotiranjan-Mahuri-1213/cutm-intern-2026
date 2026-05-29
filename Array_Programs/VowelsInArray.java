package Array_Programs;

import java.util.Scanner;

public class VowelsInArray {

    public static void printVowel(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        char[] ch=new char[size];
        System.out.println("Enter the characters: ");
        for(int i=0;i<size;i++){
            ch[i]=sc.next().charAt(0);
        }
        System.out.println("Vowels in the Array are: ");
        for(int i=0;i<size;i++){
            char c=Character.toLowerCase(ch[i]);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println(ch[i]);
            }
        }
    }
    public static void main(String []args){
            printVowel();
    }
    
}
