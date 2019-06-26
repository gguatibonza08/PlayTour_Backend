/**
 * 
 */
package com.gguatibonza.app.models.services;

import java.util.List;

import com.gguatibonza.app.models.entities.Logro;

/**
 * @author gian
 *
 */
public interface ILogroService {

	public List<Logro> findAll();

	public Logro findById(Long id);

	public boolean existId(Long id);
}
