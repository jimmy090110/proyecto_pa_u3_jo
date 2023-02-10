package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Transactional
@Repository
public class AutomovilRepoImpl implements IAutomovilRepo{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Automovil auto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(auto);
		
	}

	//TypedQuery
	
	@Override
	public List<Automovil> buscarPorColorTypedQuery(String color) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery = this.entityManager.createQuery("select e from Automovil e where e.color = :datoColor",Automovil.class);
		myTypedQuery.setParameter("datoColor", color);
		return myTypedQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorMarcaTypedQuery(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery = this.entityManager.createQuery("select e from Automovil e where e.marca = :datoMarca",Automovil.class);
		myTypedQuery.setParameter("datoMarca", marca);
		return myTypedQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorPlacaTypedQuery(String placa) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery = this.entityManager.createQuery("select e from Automovil e where e.placa = :datoPlaca",Automovil.class);
		myTypedQuery.setParameter("datoPlaca", placa);
		return myTypedQuery.getResultList();
	}

	//NamedQuery
	@Override
	public List<Automovil> buscarPorColorNamedQuery(String color) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorColor");
		myQuery.setParameter("datoColor", color);
		return (List<Automovil>) myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorMarcaNamedQuery(String marca) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorMarca");
		myQuery.setParameter("datoMarca", marca);
		return (List<Automovil>) myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorPlaca");
		myQuery.setParameter("datoPlaca", placa);
		return (List<Automovil>) myQuery.getResultList();
	}

	//NativeQuery
	@Override
	public List<Automovil> buscarPorColorNativeQuery(String color) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from automovil where aut_color=:datoColor", Automovil.class);
		myQuery.setParameter("datoColor", color);
		return (List<Automovil>) myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorMarcaNativeQuery(String marca) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from automovil where aut_marca=:datoMarca", Automovil.class);
		myQuery.setParameter("datoMarca", marca);
		return (List<Automovil>) myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorPlacaNativeQuery(String placa) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from automovil where aut_placa=:datoPlaca", Automovil.class);
		myQuery.setParameter("datoPlaca", placa);
		return (List<Automovil>) myQuery.getResultList();
	}
	
	//NamedNativeQuery

	@Override
	public List<Automovil> buscarPorColorNamedNativeQuery(String color) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorColor", Automovil.class);
		myQuery.setParameter("datoColor", color);
		return myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorMarcaNamedNativeQuery(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorMarca", Automovil.class);
		myQuery.setParameter("datoMarca", marca);
		return myQuery.getResultList();
	}

	@Override
	public List<Automovil> buscarPorPlacaNamedNativeQuery(String placa) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorPlaca", Automovil.class);
		myQuery.setParameter("datoPlaca", placa);
		return myQuery.getResultList();
	}

}
