package com.example.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU3JoApplication implements CommandLineRunner {
	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IHabitacionService habitacionService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		Estudiante estudiante =new Estudiante();
		estudiante.setNombre("Juan");
		estudiante.setApellido("Perez");
		estudiante.setCedula("1718903778");
		estudiante.setCiudad("Quito");
		estudiante.setGenero("M");
		estudiante.setId(1);
		this.estudianteService.insertar(estudiante);
		/*
		 */
		
		List<Hotel> lista= this.hotelService.buscarHotelOuterLeftJoin();
		for (Hotel h : lista) {
			System.out.println(h.getNombre());
			
		}
		
		/*
		List<Habitacion> listah= this.habitacionService.buscarHabitacionOuterLeftJoin();
		for (Habitacion ha : listah) {
			System.out.println(ha.getNumero());
			
		}
		
		*/
		/*List<Hotel>lista = this.hotelService.buscarHotelInnerJoin("VIP");
		for(Hotel h:lista) {
			System.out.println(h.getNombre());
			for(Habitacion ha : h.getHabitacion()) {
				System.out.println("Las habitaciones:  "+ h.getNombre());
			}
			System.out.println();
		}
		
		List<Hotel>lista2 = this.hotelService.buscarloHotelJoinFech("VIP");
		for(Hotel h:lista2) {
			System.out.println(h.getNombre());
			for(Habitacion ha : h.getHabitacion()) {
				System.out.println("Las habitaciones:  "+ h.getNombre());
			}
			System.out.println();
		}
		
//		List<Hotel>lista3 = this.hotelService.bucarHotelRighJoin("VIP");
//		for(Hotel h:lista3) {
//			System.out.println(h.getNombre());
//			for(Habitacion ha : h.getHabitacion()) {
//				System.out.println("Las habitaciones"+ h.getNombre());
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
	
		
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
