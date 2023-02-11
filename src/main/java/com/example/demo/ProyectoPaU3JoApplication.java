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
		estudiante.setNombre("Juan");
		estudiante.setApellido("Perez");
		estudiante.setCedula("1718903778");
		estudiante.setCiudad("Quito");
		estudiante.setGenero("M");
		estudiante.setId(1);
		this.estudianteService.insertar(estudiante);
		/*
		
		
		
		
	
		
		/*System.out.println("Busqueda de un EstudianteDTO: ");
		System.out.println(this.estudianteService.buscarPorNombreTypeQueryDTO("Jimmy"));

		System.out.println("Busqueda de Estudiante por Criteria API Query:");
		System.out.println(this.estudianteService.buscarPorNombreCriteria("Jimmy"));

		System.out.println("Busqueda de Estudiante por Criteria API Query con AND y OR:");
		System.out.println(this.estudianteService.buscarPorNombreCriteriaAndOr("Jimmy", "Ortega", "M"));
		*/
		
		//System.out.println("Eliminacion por Apellido");
		//System.out.println(this.estudianteService.eliminarPorApellido("Ortega"));
		
		//System.out.println("actualizacion por Apellido");
		//System.out.println(this.estudianteService.actualizarPorApellido("Ortega", "Pedro"));

		
		
	}

}
