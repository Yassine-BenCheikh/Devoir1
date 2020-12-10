package com.example.Atelier01;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Atelier01.entities.Voiture;
import com.example.Atelier01.service.VoitureService;

@SpringBootApplication
public class Atelier01Application implements CommandLineRunner {

	@Autowired
	VoitureService voitureService;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Atelier01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		voitureService.saveVoiture(new Voiture("range rover", 260.000, new Date()));
		voitureService.saveVoiture(new Voiture("jeep", 280.000, new Date()));
		voitureService.saveVoiture(new Voiture("G-Class", 900.000, new Date()));
		
	}

}
