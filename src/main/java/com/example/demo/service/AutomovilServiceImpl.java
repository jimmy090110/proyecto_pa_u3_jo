package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.repository.IAutomovilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilService{

	@Autowired
	private IAutomovilRepo automovilRepo;
	@Override
	public void insertar(Automovil auto) {
		// TODO Auto-generated method stub
		this.automovilRepo.insertar(auto);
		
	}

	//TypedQuery
	@Override
	public List<Automovil> buscarPorColorTypedQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorColorTypedQuery(color);
	}

	@Override
	public List<Automovil> buscarPorMarcaTypedQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaTypedQuery(marca);
	}

	@Override
	public List<Automovil> buscarPorPlacaTypedQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaTypedQuery(placa);
	}

	//NamedQuery
	@Override
	public List<Automovil> buscarPorColorNamedQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorColorNamedQuery(color);
	}

	@Override
	public List<Automovil> buscarPorMarcaNamedQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaNamedQuery(marca);
	}

	@Override
	public List<Automovil> buscarPorPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaNamedQuery(placa);
	}
	
	//NativeQuery

	@Override
	public List<Automovil> buscarPorColorNativeQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorColorNativeQuery(color);
	}

	@Override
	public List<Automovil> buscarPorMarcaNativeQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaNativeQuery(marca);
	}

	@Override
	public List<Automovil> buscarPorPlacaNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaNativeQuery(placa);
	}

	//NamedNativeQuery
	@Override
	public List<Automovil> buscarPorColorNamedNativeQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorColorNamedNativeQuery(color);
	}

	@Override
	public List<Automovil> buscarPorMarcaNamedNativeQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorMarcaNamedNativeQuery(marca);
	}

	@Override
	public List<Automovil> buscarPorPlacaNamedNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaNamedNativeQuery(placa);
	}

}
