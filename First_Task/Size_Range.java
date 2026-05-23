//Write a program to find the size and range of primitive data types.

public class Size_Range {
    public static void main(String []args ){
        System.out.println("The size of int : "+Integer.SIZE +" bit and Range : " + Integer.MIN_VALUE +" to "+ Integer.MAX_VALUE );
        System.out.println("The size of Float : "+Float.SIZE +" bit and Range : " + Float.MIN_VALUE +" to "+ Float.MAX_VALUE);
        System.out.println("The size of char : "+Character.SIZE +" bit and Range : " + Character.MIN_VALUE +" to "+ Character.MAX_VALUE);
        System.out.println("The size of byte : "+Byte.SIZE +" bit and Range : " + Byte.MIN_VALUE +" to "+ Byte.MAX_VALUE);
        System.out.println("The size of short : "+Short.SIZE +" bit and Range : " + Short.MIN_VALUE +" to "+ Short.MAX_VALUE);
        System.out.println("The size of long : "+Long.SIZE +" bit and Range : " + Long.MIN_VALUE +" to "+ Long.MAX_VALUE);
        System.out.println("The size of double : "+Double.SIZE +" bit and Range : " + Double.MIN_VALUE +" to "+ Double.MAX_VALUE);
}
}