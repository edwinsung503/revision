package com.vtx.bootcamp;

public class StringBuilder1 {

  public static void main(String[] args) {
    //StringBuilder not thread safe 
    //if single thread -> you dont new a thread 
    StringBuilder sb = new StringBuilder();
    sb.append("hello");//pass by reference

    appendOne(sb);
    System.out.println(sb.toString());//helloOne

    String result = appendOne2(sb);
    System.out.println(result);//helloOneOne
  }

  public static void appendOne(StringBuilder sb){
    sb.append("One");
  }

  public static String appendOne2(StringBuilder sb){
    return sb.append("One").toString(); // .toString() -> new String
  }
  
}
