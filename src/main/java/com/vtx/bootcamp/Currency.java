package com.vtx.bootcamp;

//backend
//status(Ordered/Shipped/Paid)
//Country code (HK,UK,US)
//VIP(Gold/Silver)


//Frondend enum
//Dropdown box(Occupation, Salary range,)
public enum Currency {
  HKD("Hong Kong"),
  CNY("China"),
  USD("US");

  private String desc;

  private Currency(String desc){
    this.desc = desc;
  }

  public String getDesc(){
    return this.desc;
  }

}
