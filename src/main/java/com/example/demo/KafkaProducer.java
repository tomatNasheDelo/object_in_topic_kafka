package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaProducer {
	
	@Autowired KafkaTemplate<String, Book> kafkaTemplate;
	
	private static final String TOPIC = "new_tema22";
	
	 public String publishMessage(Book book) 
	    { 
	        // Sending the message 
	        kafkaTemplate.send(TOPIC, book); 
	  
	        return "Published Successfully"; 
	    } 
	

}
