/**
 * 
 */
package com.gguatibonza.app.models.services.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gguatibonza.app.models.entities.Pais;
import com.gguatibonza.app.models.services.IPaisService;

/**
 * @author gian
 *
 */
@Service
public class PaisImplements implements IPaisService {

	@Override
	public List<Pais> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
