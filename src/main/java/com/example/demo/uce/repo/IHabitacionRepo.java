package com.example.demo.uce.repo;

import java.util.List;

import com.example.demo.uce.modelo.Habitacion;

public interface IHabitacionRepo {
	
	public List<Habitacion>buscarHabitacionOuterLeftJoin();
	public List<Habitacion>buscarHabitacionOuterRigtJoin();
	public List<Habitacion>buscarHabitacionOuterFullJoin();

}
