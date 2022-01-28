package com.isu.Consumer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isu.Consumer.Model.City;
import com.isu.Consumer.Service.ConsumerService;

@RestController
public class ConsumerController {

	@Autowired
	private ConsumerService cs;

	@GetMapping("/show")
	public ResponseEntity<City> getWeather(){
		return cs.getAll();
	}
}
