/**
 * 
 */
package com.gguatibonza.app.models.services.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gguatibonza.app.models.entities.Departamento;
import com.gguatibonza.app.models.entities.Pais;
import com.gguatibonza.app.models.services.IDepartamentoService;

/**
 * @author gian
 *
 */
@Service
public class DepartamentoImplements implements IDepartamentoService {

	@Override
	public List<Departamento> findByPaisOrderByName(Pais pais) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departamento> findAllOrderByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departamento findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existId(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
