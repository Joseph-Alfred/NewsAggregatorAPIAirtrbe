package com.airtribe.NewsAggregatorAPI;

import com.airtribe.NewsAggregatorAPI.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewsAggregatorApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(NewsAggregatorApiApplication.class, args);
		User user = new User();
		user.setUserName("alfred_01");
		user.setPassword("12345678");
		user.setEmail("alfredk@gmail.com");

	}

}
