package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3JoApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	
		
		System.out.println("Nombre estudiante:"+ this.estudianteService.encontrarNombre("Jimmy"));
		System.out.println("Apellido estudiante:"+ this.estudianteService.encontrarApellido("Ortega"));
		System.out.println("Genero estudiante:"+ this.estudianteService.encontrarGenero("Masculino"));
		System.out.println("Cedula estudiante:"+ this.estudianteService.encontrarcedula("105966337"));
		System.out.println("Ciudad estudiante:"+ this.estudianteService.encontrarCiudad("Quito"));
		
	}

}
