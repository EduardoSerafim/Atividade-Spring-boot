package br.com.fiap.checkpoint.Checkpoint1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"br.com.fiap.checkpoint.controllers"})
public class Checkpoint1Application {

	public static void main(String[] args) {
		SpringApplication.run(Checkpoint1Application.class, args);
	}

}
