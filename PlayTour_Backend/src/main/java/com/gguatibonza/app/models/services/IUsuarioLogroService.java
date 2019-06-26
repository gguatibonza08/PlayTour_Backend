/**
 * 
 */
package com.gguatibonza.app.models.services;

import java.util.List;

import com.gguatibonza.app.models.entities.Usuario;
import com.gguatibonza.app.models.entities.UsuarioLogro;

/**
 * @author gian
 *
 */
public interface IUsuarioLogroService {

	public void save(UsuarioLogro usuarioLogro);

	public UsuarioLogro findById(Long id);

	public boolean existById(Long id);

	public List<UsuarioLogro> findByUsuario(Usuario usuario);

}
