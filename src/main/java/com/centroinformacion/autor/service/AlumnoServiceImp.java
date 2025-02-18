package com.centroinformacion.autor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centroinformacion.autor.entity.Alumno;
import com.centroinformacion.autor.repository.AlumnoRepository;

@Service
public class AlumnoServiceImp implements AlumnoService {

	@Autowired
	private AlumnoRepository repository;

	@Override
	public List<Alumno> listaTodos() {
		return repository.findByOrderByApellidosAsc();
	}

	@Override
	public Alumno insertaAlumno(Alumno obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

	
}
