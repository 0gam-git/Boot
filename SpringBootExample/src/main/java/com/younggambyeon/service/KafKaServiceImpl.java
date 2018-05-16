package com.younggambyeon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafKaServiceImpl implements ISender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	private static String topic = "test";

	@Override
	public void send(String message) {
		kafkaTemplate.send(topic, message);
	}

}
