package com.example.weblogic.weblogic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeblogicApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeblogicApplication.class, args);
	}
	
	/**
	 * Metodo para iniciar la instancia del metodo RestTemplate
	 * 
	 * @return RestTemplate
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
