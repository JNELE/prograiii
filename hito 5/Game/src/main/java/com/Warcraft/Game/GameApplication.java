package com.Warcraft.Game;

import com.Warcraft.Game.Service.ElfoService;
import com.Warcraft.Game.Service.HumanService;
import com.Warcraft.Game.Service.MuertosVService;
import com.Warcraft.Game.Service.OrcoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class GameApplication {
	@Autowired
	private OrcoService orcoService;
	@Autowired
	private MuertosVService muertosVService;
	@Autowired
	private HumanService HumanService;
	@Autowired
	private ElfoService elfoService;


	public static void main(String[] args) {
		//SpringApplication.run(Hito4Application.class, args);

		SpringApplicationBuilder springApp = new SpringApplicationBuilder(GameApplication.class);
		springApp.headless(false);
		springApp.run(args);
	}
	@PostConstruct
	public void insertDataToDataBase(){
		muertosVService.saveData();
		orcoService.saveData();
		HumanService.saveData();
		elfoService.saveData();
	}
}
