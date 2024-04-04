package com.vtx.bootcamp.generic;

public class Printer<T, U, V> {
  
  //API response -> 對any type
  //Type夠用就唔使用 generic 
  private T data;

  private U data2;

  private V data3;

  public T getData(){
    return data;
  }
  public void setData(T data){
    this.data = data;
  }
  //static -> 俾range -> <T>

  //cannot convert from int to TJava(16777235)
  // public static <T extends Number> T xx(String s){
  //   return 1;
  // }
  //correct answer
  public static <T extends Number> String yyy(T num){//"<T extends Number>" complie time error
    //原意係只係俾人俾數字有range -> only int ,Integer , double , long ....
    //Number change to String
    int x = 0;
    if (num instanceof Integer){
      x = (Integer) num + 10;
      //x = num + 10; 
      //complie time errror as no one know what type it is 
      //The operator + is undefined for the argument type(s) T, intJava(536871072) 因為未知佢係什麼type-> set Type
      return String.valueOf(num);
    }
    return "this";
  }

  public static <T extends CharSequence> String zzz(T str){
    String result = "";
    if (str instanceof String){
      result = ((String) str).concat("world");
    } else if (str instanceof StringBuilder){
      result = ((StringBuilder) str).append("world").toString();
      //String is immuteable /-> create a new String
    }
    System.out.println(str);//hello -> str 還在
    return result;
  }
  //If str is an instance of a different class that extends CharSequence, 
  //but does not have a concat method, a compile-time error will occur. 

  public static <T extends Number> String xx(String s){
    return "this";
  }

  public static void main(String[] args) {
    //Generic
    Printer<String> printer = new Printer<>();
    printer.setData("Hello World");
    System.out.println(printer.getData());//String
    //String Printer

    StringPrinter printer2 = new StringPrinter();
    printer2.setData("hello");
    System.out.println(printer2.getData());

    System.out.println(Printer.yyy(Integer.valueOf(300)));//"300"
    //System.out.println(Printer.yyy("hello"));//complie time error -> type problem

    Printer.zzz("hello "); // "hello world"

    Printer.zzz(new StringBuilder("hello"));
  }

}
