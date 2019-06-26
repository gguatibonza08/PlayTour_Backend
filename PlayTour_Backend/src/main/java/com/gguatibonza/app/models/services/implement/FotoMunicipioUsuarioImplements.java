/**
 * 
 */
package com.gguatibonza.app.models.services.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gguatibonza.app.models.entities.FotoMunicipioUsuario;
import com.gguatibonza.app.models.entities.Municipio;
import com.gguatibonza.app.models.entities.Usuario;
import com.gguatibonza.app.models.services.IFotoMunicipioUsuarioService;

/**
 * @author gian
 *
 */
@Service
public class FotoMunicipioUsuarioImplements implements IFotoMunicipioUsuarioService {

	@Override
	public boolean existById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void guardarFoto(FotoMunicipioUsuario fotoMunicipioUsuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<FotoMunicipioUsuario> findAllByMunicipioOrderByFecha(Municipio municipio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FotoMunicipioUsuario> findAllByUsuarioOrderByFecha(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarFoto(Long id) {
		// TODO Auto-generated method stub

	}

}
