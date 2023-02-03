package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.repository.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepo clienteRepo;
	
	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertar(cliente);
		
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.actulizar(cliente);
		
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscar(id);
	}

	@Override
	public Cliente buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscarCedula(cedula);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.clienteRepo.borrar(id);
		
	}

}
