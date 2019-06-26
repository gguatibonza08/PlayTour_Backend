/**
 * 
 */
package com.gguatibonza.app.models.services.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gguatibonza.app.models.entities.Logro;
import com.gguatibonza.app.models.services.ILogroService;

/**
 * @author gian
 *
 */
@Service
public class LogroImplements implements ILogroService {

	@Override
	public List<Logro> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Logro findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existId(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
