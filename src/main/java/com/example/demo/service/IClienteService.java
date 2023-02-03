package com.example.demo.service;

import com.example.demo.modelo.Cliente;

public interface IClienteService {
	public void insertar(Cliente cliente);

	public void actualizar(Cliente cliente);

	public Cliente buscar(Integer id);
	
	public Cliente buscarCedula(String cedula);

	public void borrar(Integer id);

}
