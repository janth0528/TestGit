package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		log.debug("this is debug");
        log.trace("this is trace");
        log.info("this is info");
        log.warn("this is warn");
        log.error("this is error  ");
	}

}
