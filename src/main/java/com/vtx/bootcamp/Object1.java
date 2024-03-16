package com.vtx.bootcamp;

//Polymorphism
public class Object1 {

  public static void main(String[] args) {
    Object father = new Father();
    Father father2= (Father) father;

    Object something = createFather(3);
    //Dog dog = (Dog) something;
    if (something instanceof Dog){
      Dog dog = (Dog) something;
    } else {
      Father father3 = (Father) something;
    }
  }

  public static Object createFather(int x){
    if (x % 2 ==0){
      return new Father();
    } else {
      return new Dog();
    }
    
  }
  
}
