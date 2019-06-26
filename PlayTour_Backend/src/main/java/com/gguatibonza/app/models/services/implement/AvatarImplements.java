/**
 * 
 */
package com.gguatibonza.app.models.services.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Sort;

import com.gguatibonza.app.models.daos.IAvatarDao;
import com.gguatibonza.app.models.entities.Avatar;
import com.gguatibonza.app.models.entities.Ruta;
import com.gguatibonza.app.models.services.IAvatarService;

/**
 * @author gian
 *
 */
@Service
public class AvatarImplements implements IAvatarService {

	@Autowired
	private IAvatarDao avatarDao;

	@Override
	@Transactional(readOnly = true)
	public List<Avatar> findAll() {
		// TODO Auto-generated method stub
		return avatarDao.findAll(Sort.by("ruta").ascending());
	}

	@Override
	@Transactional(readOnly = true)
	public List<Avatar> findByRuta(Ruta ruta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public Avatar findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public boolean existById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
