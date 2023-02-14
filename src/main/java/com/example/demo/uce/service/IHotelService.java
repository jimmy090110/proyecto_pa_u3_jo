package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.modelo.Hotel;

public interface IHotelService {
	
	public List<Hotel>buscarHotelInnerJoin(String tipoHabitacion);
	public List<Hotel>buscarloHotelLeftJoin(String tipoHabitacion);
	public List<Hotel>bucarHotelRighJoin(String tipoHabitacion);
	public List<Hotel>buscarHotelFullJoin(String tipoHabitacion);
	public List<Hotel>buscarHotelOuterJoin(String tipoHabitacion);

}
