/**
 * 
 */
package com.gguatibonza.app.models.services;

import java.util.List;

import com.gguatibonza.app.models.entities.Pais;

/**
 * @author gian
 *
 */
public interface IPaisService {

	public List<Pais> findAll();

	public boolean existById(Long id);

}
