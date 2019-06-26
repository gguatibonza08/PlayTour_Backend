/**
 * 
 */
package com.gguatibonza.app.models.services;

import com.gguatibonza.app.models.entities.Usuario;

/**
 * @author gian
 *
 */
public interface IUsuarioService {

	public Usuario findById(Long id);

	public boolean existId(Long id);

	public void save(Usuario usuario);

	public void delete(Long id);

	public boolean findByCorreoOrUsername(String correo, String username);

}
