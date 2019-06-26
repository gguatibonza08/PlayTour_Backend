/**
 * 
 */
package com.gguatibonza.app.models.services.implement;

import org.springframework.stereotype.Service;

import com.gguatibonza.app.models.entities.Usuario;
import com.gguatibonza.app.models.services.IUsuarioService;

/**
 * @author gian
 *
 */
@Service
public class UsuarioImplements implements IUsuarioService {

	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existId(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void save(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean findByCorreoOrUsername(String correo, String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
