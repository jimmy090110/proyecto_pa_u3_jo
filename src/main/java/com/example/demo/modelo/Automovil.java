package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="automovil")

@NamedQuery(name = "Automovil.buscarPorColor" , query = "select a from Automovil a where a.color = :datoColor")
@NamedQuery(name = "Automovil.buscarPorMarca" , query = "select a from Automovil a where a.marca = :datoMarca")
@NamedQuery(name = "Automovil.buscarPorPlaca" , query = "select a from Automovil a where a.placa = :datoPlaca")
public class Automovil {
	
	@Id
	@Column(name="aut_id")
	private Integer id;
	
	@Column(name="aut_precio")
	private BigDecimal precio;
	
	@Column(name="aut_placa")
	private String placa;
	
	@Column(name="aut_categoria")
	private String categoria;
	
	@Column(name="aut_color")
	private String color;
	
	@Column(name="aut_anio")
	private String anio;
	
	@Column(name="aut_marca")
	private String  marca;
	
	
	

	
	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", precio=" + precio + ", placa=" + placa + ", categoria=" + categoria
				+ ", color=" + color + ", anio=" + anio + ", marca=" + marca + ", motor=" + motor + "]";
	}

	//Set and Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	@Column(name="vehi_motor")
	private String motor;
	
}

	
	

	
	