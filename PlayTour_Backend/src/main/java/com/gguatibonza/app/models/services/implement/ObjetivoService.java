/**
 * 
 */
package com.gguatibonza.app.models.services.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gguatibonza.app.models.entities.Logro;
import com.gguatibonza.app.models.entities.Objetivo;
import com.gguatibonza.app.models.services.IObjetivoService;

/**
 * @author gian
 *
 */
@Service
public class ObjetivoService implements IObjetivoService {

	@Override
	public List<Objetivo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Objetivo findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existId(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Objetivo> findAllByLogro(Logro logro) {
		// TODO Auto-generated method stub
		return null;
	}

}
