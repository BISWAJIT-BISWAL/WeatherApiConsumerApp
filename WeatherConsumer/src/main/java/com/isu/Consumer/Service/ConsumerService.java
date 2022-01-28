package com.isu.Consumer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.isu.Consumer.Model.City;

@Service
public class ConsumerService {

	  @Autowired 
	  private RestTemplate rt;
	  private String cityName="odisha"; 
	  private String apiKey="b1097bb96eb3e90018fb5ccb5edf2791"; 
	  private String url="https://api.openweathermap.org/data/2.5/weather?q="+cityName+"&appid="+apiKey;
	  
	 
	public ResponseEntity<City> getAll() {

		ResponseEntity<City> resp = rt.exchange(url, HttpMethod.GET, null, City.class);
		return resp;
	}
}
