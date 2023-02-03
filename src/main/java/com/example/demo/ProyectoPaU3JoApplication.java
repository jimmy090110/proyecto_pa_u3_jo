package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IClienteService;

import com.example.demo.service.IRentaService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU3JoApplication implements CommandLineRunner{

	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IVehiculoService vehiculoService;
	
	@Autowired
	private IRentaService rentaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	
		List<Renta> renta=new ArrayList<>();
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setId(1);
		vehiculo.setCategoria("Deportivo");
		vehiculo.setPlaca("ASD123");
		vehiculo.setPrecioDia(new BigDecimal(18));
		
		Cliente cli=new Cliente();
		cli.setId(1);
		cli.setNombre("Jimmy");
		cli.setApellido("Ortega");
		cli.setCedula("105966337");
		cli.setTarjetaCredito("1111111");
		
		this.vehiculoService.insertar(vehiculo);
		this.clienteService.insertar(cli);
		
		Renta rentas=this.rentaService.insertarRenta("ASD123", "105966337");
		renta.add(rentas);
		cli.setRenta(renta);
		vehiculo.setRenta(renta);
	
		
		
		
	
		
		
	}

}
