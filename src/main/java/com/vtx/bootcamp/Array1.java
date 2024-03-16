package com.vtx.bootcamp;

public class Array1 {
  
  public static void main(String[] args) {
    int[] arr = new int[]{1,2,3};

    int[] arr2 = new int[3];
    arr2[0] = 1;
    arr2[1] = 2;
    arr2[2] = 3;

    //int[] arr3 = {1,2,3};

    // for (int i = 0 ; i <arr.length-1 ; i++){

    // }

    // for (int i: arr){

    // }

    addOne(arr);// pass by reference
    print(arr);
    
    Integer i9 = addOne(5);
    System.out.println("i9=" + i9);
    
    String s9 ="hello";
    addOne(s9);
    System.out.println("s9="+s9);//hello1
  }

  public static void print(int[] arr) {
    for (int i:arr){
      System.out.println(i);
    }
  }

  public static Integer addOne(Integer integer) {//pass by value (Wrapper Class)
    return integer +1;
  }

  public static String addOne(String str) {//pass by value (Wrapper Class)-> 要有return value to s9 所以
    return str.concat("1") ;
  }

  //pass by reference -> int[] arr = new int[]{1,2,3};
  public static void addOne(int[] arr ){// pass by reference (Array or Custom Class)
    for (int i = 0 ; i< arr.length; i++ ){
      arr[i] ++;
    }
  }
}