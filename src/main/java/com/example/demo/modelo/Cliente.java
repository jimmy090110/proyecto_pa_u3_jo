package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@Column(name="clie_id")
	private Integer id;
	@Column(name="clie_cedula")
	private String cedula;
	@Column(name="clie_tarjeta_credito")
	private String tarjetaCredito;
	@Column(name="clie_nombre")
	private String nombre;
	@Column(name="clie_apellido")
	private String apellido;
	
	@OneToMany(mappedBy = "cliente" )
	private List<Renta> renta;
	
	
	

	@Override
	public String toString() {
		return "Renta [id=" + id + ", cedula=" + cedula + ", tarjetaCredito=" + tarjetaCredito + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", renta=" + renta + "]";
	}

	//Get and Set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<Renta> getRenta() {
		return renta;
	}

	public void setRenta(List<Renta> renta) {
		this.renta = renta;
	}


	
	


}
