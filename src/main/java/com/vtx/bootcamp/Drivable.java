package com.vtx.bootcamp;

//Abstraction
public interface Drivable {
  
  int x = 3 ; // public static final 

  void drive(); // public 

  //default -> 
  default void sleep(){
    System.out.println("Sleeping...");
  }
  //static 
  static void eat(){
    System.out.println("Eatin");
  }

  public static void main(String[] args) {
    Drivable.eat();
    Father father = new Father();

    Drivable driver = new Father();
    Father father2 = (Father) driver;//cannot convert from Drivable to Father -> downcast
    
    father2.drive();
    father2.cook();
  }
}
