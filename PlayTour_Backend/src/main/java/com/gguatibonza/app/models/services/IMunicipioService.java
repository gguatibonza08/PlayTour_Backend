package com.gguatibonza.app.models.services;

import java.util.List;

import com.gguatibonza.app.models.entities.Departamento;
import com.gguatibonza.app.models.entities.Municipio;


/**
 * 
 * @author gian
 *
 */
public interface IMunicipioService {

	public List<Municipio> findAll();

	public boolean existId(Long id);

	public Municipio findById(Long id);

	public List<Municipio> findByDepartamento(Departamento departamento);
	
}
