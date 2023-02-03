package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepo vehiculoRepo;
	
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.insertar(vehiculo);
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.actualizar(vehiculo);
		
	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscar(id);
	}

	@Override
	public Vehiculo buscarPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscarPlaca(placa);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.borrar(id);
		
	}

}
