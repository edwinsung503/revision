package com.vtx.bootcamp;

import java.math.BigDecimal;

public class BigDecimal1 {

  public static void main(String[] args) {
    
    System.out.println(0.2+0.1);// 0.3000000

    double d1 = 0.2;
    double d2 = 0.1;
    if (d1 +d2 == 0.3) {
      System.out.println("equal");
    } else {
      System.out.println("Not equal");
    }

    //double result = sum(new BigDecimal(0.2), new BigDecimal(0.1));
    double result = sum(0.2,0.1);
    System.out.println(result);

    BigDecimal b1 = new BigDecimal("2.0");//2.0
    BigDecimal b2 = BigDecimal.valueOf(2.0);
  }

  public static double sum(double x, double y){
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }
  
}
