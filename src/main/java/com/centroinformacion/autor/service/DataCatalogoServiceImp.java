package com.centroinformacion.autor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centroinformacion.autor.entity.DataCatalogo;
import com.centroinformacion.autor.repository.DataCatalogoRepository;

@Service
public class DataCatalogoServiceImp implements DataCatalogoService {

	@Autowired
	private DataCatalogoRepository repository;

	@Override
	public List<DataCatalogo> listaDataCatalogo(int idTipo) {
		return repository.listaDataCatalogo(idTipo);
	}

}
