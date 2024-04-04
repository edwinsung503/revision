package com.vtx.bootcamp.exeception;

import java.io.IOException;

public class Calculator {
  
  // 10 / 3 -> 3 as int
  //本質自己handle 唔到就要throw
  //睇返user 係咪有需要做來做什麼

  //user agreed if y == 0 ; result == 1
  private static int sum(int x, int y) {
    if (y == 0){
      return 1;
    }
    return x / y ;  
  }
  public static String concat(String str){
    if (str == null){
      return " ";
    }
    return str.concat("world");//Null Pointer Exception
  }

  public static String replace(String original, String from, String to){
    return original.replace(from, to);
  }

  public static void main(String[] args) {
    String str = "";
    if (str == null){
      throw new NullPointerException();
    }
    String result = Calculator.concat("hello");

    try {
      //login DB or write sth to files
      throw new IOException();//一齊決定唔做野
    } catch (IOException e){

      //login DB unsuccessful

    //Login successful
  
    }
  }
  //check exception -> try catch // give to caller to try catch

  
  
}
