package com.bxczp.HelloWorld;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {

	@Bean
	public Queue HelloQueue() {
		return new Queue("hello");
	}
	
	
}
