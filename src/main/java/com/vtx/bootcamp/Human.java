package com.vtx.bootcamp;
// hr system -> 寫 human -> 好abstract class

//abstract class default public not need write public 
public abstract class Human {

  private int age;

  abstract void move(); // no block

  void eat(){
    System.out.println("i am eating");
  }
  
}
