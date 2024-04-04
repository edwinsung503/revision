package com.vtxlab.bootcamp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.vtxlab.bootcamp.model.Person;

@Configuration
//create a bean before service start
//bean vs object
// bean - spring context contain bean 
//no need self new an object
// 本身有bean 就即時用
//由object -> serialzation  變做json
// server communicate with server -> JSon jSon
//Object(server1) -> json(Server1) -> json(server 2) -> Object  (server 2)
// object - 
public class AppConfig {

  @Bean(name = "john")
  Person getPerson(){
    return new Person("John", 19);
  }

  @Bean(name = "chris")
  Person getPerson2(){
    return new Person("Chris", 23);
  }
//用autowired 去揾野去裝佩去個object
  public static void main(String[] args) {
    
    Person p1 = new Person("Mary", 20);
    //Person p2 = p1;
    p1 = new Person("Peter", 22);
  }
  
}
