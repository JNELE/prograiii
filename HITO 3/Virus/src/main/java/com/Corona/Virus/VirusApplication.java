package com.Corona.Virus;

import com.Corona.Virus.Service.CoronaVirusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class VirusApplication implements CommandLineRunner {
	@Autowired
	private CoronaVirusService coronaService[];

	public static void main(String[] args) {
		SpringApplication.run(VirusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		coronaService = new CoronaVirusService[3];
		for (int i = 0; i < 3; i++) {
			CoronaVirusService cs = new CoronaVirusService();
			cs.Leer();
			coronaService[i] = cs;
		}
		for (int i = 0; i < coronaService.length; i++) {
			coronaService[i].Mostrar();
		}
		int mayor = 0;
		int position = 0;
		mayor = coronaService[0].casosConfirmados;
		for (int i = 0; i < coronaService.length; i++) {
			if (coronaService[i].casosConfirmados > mayor) {
				mayor = coronaService[i].casosConfirmados;
				position = i;
			}
		}
		System.out.println("Departamento con mas casos es: " + coronaService[position].nombreDepartamento + " = " + mayor);
	}
}