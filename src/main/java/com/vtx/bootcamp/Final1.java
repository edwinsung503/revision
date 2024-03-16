package com.vtx.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Final1 {
  
  private static final int x1 = 3;

  private static int x2= 3;

  private final int x3 = 3;

  private int x4 =3;

  //This is to "final" address, so that you cannot change the object (i.e. LinkedList)
  //final 個型態 只可以arraylist
  private static final List<String> strings = new ArrayList<>();

  public void setX4(int x4){
    this.x4 = x4;
  }
  public static void main(String[] args) {
    Final1 f1 =new Final1();
    f1.setX4(10);

    //x1 
    //x1 = 2 ; // cannt due to finall already
    // static 無object , 只可以class dot static final 

    System.out.println(Final1.x1+2); //5

    //x2
    x2 = 2;
    System.out.println(Final1.x2+2);//4


    //x3
    Final1 f2 = new Final1();
    //f2.x3 = 4 /// due to final cannot assign new value
    System.out.println(f2.x3 + 2);//5

    strings.add("Edwin");
    strings.add("Tommy");
    strings.remove(0); // remove by index
    System.out.println(strings);
    
  }



}
