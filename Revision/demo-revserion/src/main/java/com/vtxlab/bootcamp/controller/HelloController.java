package com.vtxlab.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vtxlab.bootcamp.model.Person;
import com.vtxlab.bootcamp.service.HelloService;

@RestController
@RequestMapping(value = "/api/v1")
public class HelloController {

  //@Autowired //(required = false) // server start 唔一定要有object -> 自己XX error
  //why bean not object \
  @Autowired 
  private HelloService helloService ;

  @Autowired
  @Qualifier(value = "john")
  private Person person; // John, 19

  
  @GetMapping(value = "/hello/{x}/{y}")
  public String greeting(@PathVariable (value = "x") Integer a, 
                @PathVariable (value = "y") Integer b){
                return String.valueOf(helloService.sum(a,b));
                }
  
}
