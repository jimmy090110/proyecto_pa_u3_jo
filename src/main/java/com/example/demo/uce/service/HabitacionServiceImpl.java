package com.example.demo.uce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.repo.IHabitacionRepo;

@Service
public class HabitacionServiceImpl implements IHabitacionService {

	@Autowired
	private IHabitacionRepo habitacionRepo;
	@Override
	public List<Habitacion> buscarHabitacionOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHabitacionOuterLeftJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionOuterRigtJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHabitacionOuterRigtJoin();
	}

	@Override
	public List<Habitacion> buscarHabitacionOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepo.buscarHabitacionOuterFullJoin();
	}

}
