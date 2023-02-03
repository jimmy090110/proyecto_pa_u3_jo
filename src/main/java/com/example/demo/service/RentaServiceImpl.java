package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IRentaRepo;

@Service
public class RentaServiceImpl implements IRentaService{
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IVehiculoService vehiculoService;
	
	@Autowired
	private IRentaRepo rentaRepo;
	

	@Override
	public Renta insertarRenta(String placa, String cedula) {
		// TODO Auto-generated method stub
		
		Cliente cli = this.clienteService.buscarCedula(cedula);
		Vehiculo vehi= this.vehiculoService.buscarPlaca(placa);
		
		Renta rent = new Renta();
		rent.setCliente(cli);
		rent.setVehiculo(vehi);
		
		this.rentaRepo.insertar(rent);
		return rent;
	}

}
