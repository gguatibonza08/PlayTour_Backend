/**
 * 
 */
package com.gguatibonza.app.models.services;

import java.util.List;

import com.gguatibonza.app.models.entities.Usuario;
import com.gguatibonza.app.models.entities.UsuarioObjetivo;

/**
 * @author gian
 *
 */
public interface IUsuarioObjetivoService {

	public void save(UsuarioObjetivo usuarioObjetivo);

	public List<UsuarioObjetivo> findByUsuario(Usuario usuario);

}
