/**
 * 
 */
package com.gguatibonza.app.models.services.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gguatibonza.app.models.entities.Usuario;
import com.gguatibonza.app.models.entities.UsuarioLogro;
import com.gguatibonza.app.models.services.IUsuarioLogroService;

/**
 * @author gian
 *
 */
@Service
public class UsuarioLogroImplements implements IUsuarioLogroService {

	@Override
	public void save(UsuarioLogro usuarioLogro) {
		// TODO Auto-generated method stub

	}

	@Override
	public UsuarioLogro findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UsuarioLogro> findByUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
