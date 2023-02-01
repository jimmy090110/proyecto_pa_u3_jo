package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repository.IEstudianteRepo;


public class EstudianteServiceImpl implements IEstudianteService {

	
	@Autowired
	private IEstudianteRepo estudianteRepo;
	@Override
	public Estudiante encontrar(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarporNombreQuery(nombre);
	}

}
