/**
 * 
 */
package com.gguatibonza.app.models.services;

import java.util.List;

import com.gguatibonza.app.models.entities.Avatar;
import com.gguatibonza.app.models.entities.Ruta;

/**
 * @author gian
 *
 */
public interface IAvatarService {

	public List<Avatar> findAll();

	public List<Avatar> findByRuta(Ruta ruta);

	public Avatar findById(Long id);

	public boolean existById(Long id);
}
