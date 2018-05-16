package com.younggambyeon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.younggambyeon.service.ISender;

@RestController
public class HelloController {
	
	@Autowired
	private ISender kafkaService;
	

	@GetMapping(value = "/start/boot")
	public String callHelloWorld() {
		return "Hello World!";
	}

	@GetMapping(value = "/start/kafka")
	public String callkafka(@RequestParam String message) {
		
		kafkaService.send(message);
		
		return "Hello Kafka!";
	}

}
