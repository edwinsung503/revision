package com.vtx.bootcamp;

public class DataType1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //17 primitive / Wrapper Class, String
        //boolean/int/double/
        //string
        int i1 =0;
        byte b1= 0; //int -> byte

        short s1 =0; // int -> short
        long l1 =0 ; // int -> long
        float f1 = 2.3f;

        //upcaset
        int i3 = 3;
        long l3 = i3;
        double d3 = i3;
        //downcast
        long l4 = 9;
        int i4 = (int) l4;
        double d4 = 9.3;
        int i5 = (int) d4; // double -> int = precision loss -> 9

        //Wrapper class
        Integer i6 = 10; // IntHolder.java
        //Integer i8 = i6 -5 ; // (i6 - 5) -> int(Autobox) -> Integer 
        Integer i7 = i6 - 5; // i6 - 5 -> already change to int

        Integer i9 = 12;
        Integer i10 = 9;
        int i11 = i9 - i10; //Integer (Object )-> int (process : downcast)



    }
}