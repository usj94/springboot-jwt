package com.uma.jwtspringboot;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JwtSpringBootApplicationTests {

	@Test
	public void contextLoads() {
		assertEquals("Result", true, true);
	fail();
	}

}
