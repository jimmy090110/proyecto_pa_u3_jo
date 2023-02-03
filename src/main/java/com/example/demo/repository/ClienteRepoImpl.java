package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ClienteRepoImpl implements IClienteRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
		
	}

	@Override
	public void actulizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cliente);
		
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Cliente.class, id);
	}

	@Override
	public Cliente buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuerry=this.entityManager.
				createQuery("select e from  Cliente e where e.cedula =:datoCedula");
		jpqlQuerry.setParameter("datoCedula", cedula);
		return (Cliente) jpqlQuerry.getSingleResult();
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		Cliente cli = this.buscar(id);
		this.entityManager.remove(cli);
		
	}
	

}
