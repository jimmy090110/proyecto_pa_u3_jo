package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	
	@Autowired
	private IEstudianteRepo estudianteRepo;

	@Override
	public Estudiante encontrarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarporNombreQuery(nombre);
	}

	@Override
	public Estudiante encontrarApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarporApellidoQuery(apellido);
	}

	@Override
	public Estudiante encontrarGenero(String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarporGenerQuery(genero);
	}

	@Override
	public Estudiante encontrarcedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarporCedulaQuery(cedula);
	}

	@Override
	public Estudiante encontrarCiudad(String ciudad) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarporCiudadQuery(ciudad);
	}
	


}
