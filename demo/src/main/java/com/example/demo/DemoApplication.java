package com.example.demo;

//import java.util.Date;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		Data data = new Data();
		data.setName("Kim Spyljo562ldild");
		data.setAge(25);
		//data.setEmail("Andr8343@edu.zealand.dk");
		//data.setDato(new Date());
		// Change the URL to the desires url endpoint
		restTemplate.postForLocation("http://localhost:8080/api/person", data);
    }
}
// https://9f46-93-166-53-22.eu.ngrok.io/people

//http://localhost:8080/api/person