package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3JoApplication implements CommandLineRunner {
	@Autowired
	private IEstudianteService estudianteService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Estudiante estudiante =new Estudiante();
		estudiante.setNombre("Jimmy");
		estudiante.setApellido("Ortega");
		estudiante.setCedula("105966337");
		estudiante.setCiudad("Quito");
		this.estudianteService.crear(estudiante); */
	
		System.out.println("Busqueda por TypedQuery");
		Estudiante estudiante1=this.estudianteService.buscarPorNombreTypedQuery("Jimmy");
		System.out.println(estudiante1);
		System.out.println("Busqueda por NamedQuery");
		Estudiante estudiante2=this.estudianteService.buscarPorNombreNamedQuery("Jimmy");
		System.out.println(estudiante2);
		System.out.println("Busqueda por NamedQueryTyped");
		Estudiante estudiante3=this.estudianteService.buscarPorNombreNamedQueryTyped("Jimmy");
		System.out.println(estudiante3);
		
		
		System.out.println("Busqueda por NamedNativeQuery");
		Estudiante estudiante4=this.estudianteService.buscarPorNombreNativeQuery("Jimmy");
		System.out.println(estudiante4); 
		
		
		//System.out.println("Busqueda por TypedQueryList");
		//Estudiante estudiante1=(Estudiante) this.estudianteService.buscarPorNombreTypedQueryList("Jimmy");
		
		//System.out.println("Busqueda por TypedQueryList");
		//Estudiante estudiante=(Estudiante) this.estudianteService.buscarPorNombreTypedQueryList2("Jimmy");
		//System.out.println(estudiante);
		
		
		
		
	}

}
