package com.details.EmpDetails;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class EmpDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpDetailsApplication.class, args);
	}
}
