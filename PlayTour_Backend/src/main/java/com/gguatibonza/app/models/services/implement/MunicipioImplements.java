/**
 * 
 */
package com.gguatibonza.app.models.services.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gguatibonza.app.models.entities.Departamento;
import com.gguatibonza.app.models.entities.Municipio;
import com.gguatibonza.app.models.services.IMunicipioService;

/**
 * @author gian
 *
 */
@Service
public class MunicipioImplements implements IMunicipioService {

	@Override
	public List<Municipio> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existId(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Municipio findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Municipio> findByDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return null;
	}

}
