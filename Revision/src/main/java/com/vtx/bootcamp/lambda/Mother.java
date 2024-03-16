package com.vtx.bootcamp.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import com.vtx.bootcamp.Drivable;

public class Mother implements Drivable, Eatable, Comparable<Mother> {

  private int age ;

  public Mother(int age){
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age = age;
  }

  @Override
  public int compareTo(Mother mother){//instance method
    return Integer.compare(this.age, mother.getAge());//
  }
  
  @Override
  public void drive(){
    System.out.println("Original Mother Object - drive()");

  }
  @Override
  public void eat(){
    System.out.println("Original Mother Object - eat()");
  }


  public static void main(String[] args) {
    Drivable mother = new Mother(0);
    mother.drive();
    //mother.eat();
    Mother mother3 = (Mother) mother;
    mother3.drive();
    mother3.eat();

    Drivable mother2 = () -> System.out.println("driving"); //An Object with drive() implementation
    mother2.drive();
    //mother.eat();
    //唔可以起個obejct 就可以有個object 

    //how many object and nullpointer -> 2Object + 3 pointer
    Mother mother4 = (Mother) mother2;//Runtime Exception : ClassCastException
    mother4.drive();
    mother4.eat();

    //Sorting
    List<Mother> mothers = new ArrayList<>(List.of(new Mother(15),new Mother(6),new Mother(12)));

    
    //Approach 1
    //Comparable<Mother> mother5 = new Mother();//object with compareTo() implementation
    Collections.sort(mothers);
    System.out.println(mothers);
    //Approach 2(Lambda)
    //Comparable<Mother> sortByAgeDesc = mother -> mother.getAge(); 

    
    Comparator<Mother> sortByAgeDesc = 
      (m1,m2) -> Integer.compare(m2.getAge(), m1.getAge());
      Collections.sort(mothers,sortByAgeDesc);
      System.out.println(mothers);
    
    //Approach 3
    Comparator<Mother> sortByAgeDesc2 = 
      (m1,m2) -> {
        if (m1.getAge() > m2.getAge()){
          return 1;
        }
        return -1;
      };
      Collections.sort(mothers,sortByAgeDesc2);
      System.out.println(mothers);


      //Stream
      List<Mother> motherList = mothers.stream()//from list to stream
          .filter(e -> e.getAge() > 8)
          .collect(Collectors.toList());//"new" an ArrayList , how about mother object -> new object / old object (ANS: old object)
          //colect -> new an ArrayList -> now there is 2 Arraylist
      System.out.println(motherList);//[Mother(age=15)] , [Mother(age=12)]

      motherList.remove(0);//[Mother(age=12)

      System.out.println(motherList);
      //2條arraylist內object -> same object
      System.out.println(System.identityHashCode(motherList.get(0)));//address: [Mother(age=12)
      System.out.println(System.identityHashCode(mothers.get(1)));//address: [Mother(age=12)
      HashMap<String, Mother> hasmMap= new HashMap<>();
      hasmMap.put("123", motherList.get(0));
      hasmMap.put("234", new Mother(123));
      hasmMap.get("123");
      System.out.println(System.identityHashCode(hasmMap.get("123")));//address: [Mother(age=12)
      System.out.println(System.identityHashCode(hasmMap.get("234")));

      System.out.println(System.identityHashCode(motherList));//different
      System.out.println(System.identityHashCode(mothers));//different

      //stream.map() : mother object -> Ingeter
      //List of age
      List<Integer> ages = mothers.stream()
              .map(e -> e.getAge())
              .sorted() // increase
              //.distinct()
              .collect(Collectors.toList());
      System.out.println(ages);
  }

  public String toString(){
    return "Mother(" +//
        "age="+this.age+//
        "]";
  }
  
}
