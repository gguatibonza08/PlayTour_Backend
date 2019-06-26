/**
 * 
 */
package com.gguatibonza.app.models.services.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gguatibonza.app.models.entities.Municipio;
import com.gguatibonza.app.models.entities.Ruta;
import com.gguatibonza.app.models.services.IRutaService;

/**
 * @author gian
 *
 */
@Service
public class RutaImplements implements IRutaService {

	@Override
	public List<Ruta> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ruta> findAllByMunicipio(Municipio municipio) {
		// TODO Auto-generated method stub
		return null;
	}

}
