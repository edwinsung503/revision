package com.vtx.bootcamp;

import java.math.BigDecimal;

//要唔要new 1個object -> new Shape() 
//如果唔使new a new Shape() object -> 只睇inheritance -> 就用abstract class
public abstract class Shape1 {//interface
  ///abstract class 有instance varialbe 
  //interface 無instance varialbe 
  //interface 可以寫 lambda and stream

  //private double length;

  private String color; // 因為全部class 都有相同的instance variable

  public Shape1(String color){// can do as circle will call super()
    this.color = color;
  }

  abstract double area();

  public String getColor(){
    return this.color;
  }



  public static double totalArea(Shape1[] shapes) {
    BigDecimal total = new BigDecimal(0.0);
    for (Shape1 shape : shapes){
      total = total.add(BigDecimal.valueOf(shape.area()));//要揾返個total 接住-> new 
    }
    return total.doubleValue();
  }    
  //instance method for color
}
