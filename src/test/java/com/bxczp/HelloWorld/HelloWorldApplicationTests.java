package com.bxczp.HelloWorld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bxczp.HelloWorld.beans.Receiver;
import com.bxczp.HelloWorld.beans.Sender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldApplicationTests {

	@Autowired
	private Sender sender;
	
	@Test
	public void testSender() {
		sender.send();
	}
}
