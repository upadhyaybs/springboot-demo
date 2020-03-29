package com.bsu.demo;

import com.bsu.demo.controller.DemoController;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class SpringBootDemoApplicationTests {

	@Autowired
	DemoController demoController;
	
	
	@Test
	public void contextLoads() {
		assertThat(demoController).isNotNull();
	}

}
