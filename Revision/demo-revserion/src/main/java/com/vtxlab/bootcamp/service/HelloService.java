package com.vtxlab.bootcamp.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

  //Method A
  public int sum(int x, int y){
    return x + y ;
  }
  //Method B
  public String concat(String x, String y){
    int sum = sum(10,11);
    return x.concat(y).concat(String.valueOf(sum));
  }
}
