package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Automovil;

public interface IAutomovilRepo {
	
	//TypedQuery
	//NamedQuery
	//Native Query
	//Named Native Query
	
	public void insertar(Automovil auto);
	
	//TypedQuery
		public List<Automovil> buscarPorColorTypedQuery(String color);
		public List<Automovil> buscarPorMarcaTypedQuery(String marca);
		public List<Automovil> buscarPorPlacaTypedQuery(String placa);
		
	//NamedQuery
		public List<Automovil> buscarPorColorNamedQuery(String color);
		public List<Automovil> buscarPorMarcaNamedQuery(String marca);
		public List<Automovil> buscarPorPlacaNamedQuery(String placa);
	
	//NativeQuery
		public List<Automovil> buscarPorColorNativeQuery(String color);
		public List<Automovil> buscarPorMarcaNativeQuery(String marca);
		public List<Automovil> buscarPorPlacaNativeQuery(String placa);
		
	//NamedNativeQuery
		
		public List<Automovil> buscarPorColorNamedNativeQuery(String color);
		public List<Automovil> buscarPorMarcaNamedNativeQuery(String marca);
		public List<Automovil> buscarPorPlacaNamedNativeQuery(String placa);
		

}
