/**
 * 
 */
package com.gguatibonza.app.models.services.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gguatibonza.app.models.entities.Avatar;
import com.gguatibonza.app.models.entities.Ruta;
import com.gguatibonza.app.models.services.IAvatarService;

/**
 * @author gian
 *
 */
@Service
public class AvatarImplements implements IAvatarService {

	@Override
	public List<Avatar> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Avatar> findByRuta(Ruta ruta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Avatar findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
