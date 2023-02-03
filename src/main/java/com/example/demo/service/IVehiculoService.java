package com.example.demo.service;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void insertar(Vehiculo vehiculo);

	public void actualizar(Vehiculo vehiculo);

	public Vehiculo buscar(Integer id);
	
	public Vehiculo buscarPlaca(String placa);

	public void borrar(Integer id);

}
