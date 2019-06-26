/**
 * 
 */
package com.gguatibonza.app.models.services;

import java.util.List;

import com.gguatibonza.app.models.entities.FotoMunicipioUsuario;
import com.gguatibonza.app.models.entities.Municipio;
import com.gguatibonza.app.models.entities.Usuario;

/**
 * @author gian
 *
 */
public interface IFotoMunicipioUsuarioService {

	public boolean existById(Long id);

	public void guardarFoto(FotoMunicipioUsuario fotoMunicipioUsuario);

	public List<FotoMunicipioUsuario> findAllByMunicipioOrderByFecha(Municipio municipio);

	public List<FotoMunicipioUsuario> findAllByUsuarioOrderByFecha(Usuario usuario);

	public void eliminarFoto(Long id);

}
