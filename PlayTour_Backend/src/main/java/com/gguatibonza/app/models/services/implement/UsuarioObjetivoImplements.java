/**
 * 
 */
package com.gguatibonza.app.models.services.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gguatibonza.app.models.entities.Usuario;
import com.gguatibonza.app.models.entities.UsuarioObjetivo;
import com.gguatibonza.app.models.services.IUsuarioObjetivoService;

/**
 * @author gian
 *
 */
@Service
public class UsuarioObjetivoImplements implements IUsuarioObjetivoService {

	@Override
	public void save(UsuarioObjetivo usuarioObjetivo) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UsuarioObjetivo> findByUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
