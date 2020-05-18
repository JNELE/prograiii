package com.spring.app;


import com.spring.app.Model.ModelPersona;
import com.spring.app.Services.ServicePersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {
	@Autowired
	private ServicePersona sPersona;
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running APP!!!");
		sPersona.Insertar("Juan Eian");
	}
}


