package com.microservicioRopa;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients 
@SpringBootApplication
public class MicroservicioRopaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioRopaApplication.class, args);
	}

}
