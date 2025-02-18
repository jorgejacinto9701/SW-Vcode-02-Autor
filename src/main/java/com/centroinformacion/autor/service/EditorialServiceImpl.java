package com.centroinformacion.autor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centroinformacion.autor.entity.Editorial;
import com.centroinformacion.autor.repository.EditorialRepository;

@Service
public class EditorialServiceImpl implements EditorialService {

	@Autowired
	private EditorialRepository repository;

	@Override
	public Editorial registrarEditorial(Editorial editorial) {

		return repository.save(editorial);

	}

}
