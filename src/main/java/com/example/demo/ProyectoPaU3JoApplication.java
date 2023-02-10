package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.modelo.Automovil;
import com.example.demo.service.IAutomovilService;


@SpringBootApplication
public class ProyectoPaU3JoApplication implements CommandLineRunner{

	@Autowired
	private IAutomovilService automovilService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	
	/*Automovil auto = new Automovil();
	auto.setAnio("2020");
	auto.setCategoria("B");
	auto.setColor("verde");
	auto.setId(1);
	auto.setMarca("Mazda");
	auto.setMotor("V6");
	auto.setPlaca("PXY123");
	auto.setPrecio(new BigDecimal(10000));
	this.automovilService.insertar(auto);
	*/
	
	
	//TypedQuery
	System.out.println(this.automovilService.buscarPorColorTypedQuery("verde"));
	System.out.println(this.automovilService.buscarPorMarcaTypedQuery("Mazda"));
	System.out.println(this.automovilService.buscarPorPlacaTypedQuery("PXY123"));
	
	//NamedQuery
	System.out.println(this.automovilService.buscarPorColorNamedQuery("verde"));
	System.out.println(this.automovilService.buscarPorMarcaNamedQuery("Mazda"));
	System.out.println(this.automovilService.buscarPorPlacaNamedQuery("PXY123"));
	
	//NativeQuery
	System.out.println(this.automovilService.buscarPorColorNativeQuery("verde"));
	System.out.println(this.automovilService.buscarPorMarcaNativeQuery("Mazda"));
	System.out.println(this.automovilService.buscarPorPlacaNativeQuery("PXY123"));
	
		
	//NamedNativeQuery
	System.out.println(this.automovilService.buscarPorColorNamedNativeQuery("verde"));
	System.out.println(this.automovilService.buscarPorMarcaNamedNativeQuery("Mazda"));
	System.out.println(this.automovilService.buscarPorPlacaNamedNativeQuery("PXY123"));
	
	
	
	
	
	
		
		
		
	
		
		
	}

}
