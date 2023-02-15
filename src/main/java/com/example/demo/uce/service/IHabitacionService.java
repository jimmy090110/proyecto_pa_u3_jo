package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.modelo.Habitacion;

public interface IHabitacionService {
	public List<Habitacion>buscarHabitacionOuterLeftJoin();
	public List<Habitacion>buscarHabitacionOuterRigtJoin();
	public List<Habitacion>buscarHabitacionOuterFullJoin();

}
