package br.com.jean.padroes_proj_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Dependências utilizadas:
 *  - Spring Data JPA
 *  - Spring Web
 *  - H2 Database (BD em memória)
 *  - OpenFeign
 *  
 *  @author Jean Alves
 *  @version 1.0.0
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
