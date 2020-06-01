package com.prograiii2020.swing;

import com.prograiii2020.swing.Repository.ButtonRepository;
import com.prograiii2020.swing.Service.AlphabetService;
import com.prograiii2020.swing.Service.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SwingApplication {
	@Autowired
	private ButtonService buttonService;
	@Autowired
	private AlphabetService alphabetService;

	public static void main(String[] args) {
		//SpringApplication.run(SwingApplication.class, args);
		SpringApplicationBuilder springApp = new SpringApplicationBuilder(SwingApplication.class);
		springApp.headless(false);
		springApp.run(args);
	}

	@PostConstruct
	public void insertDataToDataBase(){
		buttonService.saveData();
		alphabetService.saveData();
	}
}
