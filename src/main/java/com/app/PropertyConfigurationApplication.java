package com.app;

import com.app.configs.CareerDetails;
import com.app.configs.PersonalDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {PersonalDetails.class, CareerDetails.class})
public class PropertyConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertyConfigurationApplication.class, args);
	}

}
