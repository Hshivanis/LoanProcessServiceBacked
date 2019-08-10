package com.wcs.app.jf.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EntityScan("com")
@EnableJpaRepositories
public class LoanProcessServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanProcessServiceApplication.class, args);
	}

}
