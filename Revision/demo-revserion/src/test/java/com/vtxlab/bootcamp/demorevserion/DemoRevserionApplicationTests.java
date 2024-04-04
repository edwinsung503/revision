package com.vtxlab.bootcamp.demorevserion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import com.vtxlab.bootcamp.service.HelloService;

@SpringBootTest // 
//@WebMvcTest
//@SpringBootTest  -> "mvn test" to trigger the spring boot env test
// simulate server start (mvn spring-boot:run)
class DemoRevserionApplicationTests {

	@Spy //fake object not in context
	//@Autowired
	//@Mock
	private HelloService helloService;


	@Test
	void contextLoads() {
	}

	@Test
	void spyTest(){
		//MOck method a
		Mockito.when(helloService.sum(10, 11)).thenReturn(100);
		//test method b

		String result = helloService.concat("hello", "world");//helloworld100
		Assertions.assertEquals(result, "helloworld100");
	}

}
