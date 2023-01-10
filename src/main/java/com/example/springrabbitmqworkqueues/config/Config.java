package com.example.springrabbitmqworkqueues.config;


import com.example.springrabbitmqworkqueues.receiver.Consumer;
import com.example.springrabbitmqworkqueues.sender.Producer;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Value("${queue.name}")
	private String queueName;

	@Bean
	public Queue queue() {
		return new Queue(queueName);
	}

	@Bean
	public Producer producer() {
		return new Producer();
	}

	@Bean
	public Consumer consumer1() {
		return new Consumer(1);
	}

	@Bean
	public Consumer consumer2() {
		return new Consumer(2);
	}

}
