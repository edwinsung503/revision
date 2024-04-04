package com.vtxlab.bootcamp2;

public class Main {
    public static void main(String[] args) {
        String s = "abc";
        Sting s2 = new String ("abc");
        Sting s3 = "abc";
        //s = s3 same object

        String result = calculate(s); // "abc"

        int [] arr =new int [] {1,2,3,4};

        String[] arr2 = new String [] {"hello", "world"};
        arr2 = new String [] {"hello", "world"};
        //4 個object 
        //arr2 = new String [] {new String ("hello"),"world"} < 多1個object-> new String ("hello")\

        int i = 3;
        //byte b = i; //downcast -> at complie time, not secure conversion -> java is a high secure language -> 
        //complie time fail
        byte b = (byte) i; // explicit conversion -> week 2 -> 
        //1. Overflow (128 -> -128) / 2. 精度損失precision loss
        
        //2.precision loss
        double i1 = 1000.3;
        byte b1 = (double) i1; 
        System.out.println(b1);//-24

        int i2 = (int) 7L;

        int i3 = (int) 22000000L;

        //Wrapper Class (Class of primitive)
        //int -> Integer (AutoBox) 
        Integer i4 = 4;
        //Integer -> int (un-box)
        int i5 = i4;
        //-> why need transfer to Wrapper class
        //1. Generics -> cannot put primitive 
        //2. int / Ingeger (DTO) // Spring -boot -> Serialization -> 用Object 好D (Wrapper Class)
        //3. Objects 

        Integer i6 = new Integer("3");
        Integer i7 = new Integer("3");
        

        //有機會autobox / unbox 做唔到


    }

    public String calculate(String x){//String x-> pass by value
        return x ; // return a String value
    }
    //wrong
    // public static int [] cal(int [] arr){ // pass by reference 
    //     return arr;
    // }

    //correct
    public static void cal(int [] arr){ // pass by reference and do nothing

    }
}