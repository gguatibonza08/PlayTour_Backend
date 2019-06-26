/**
 * 
 */
package com.gguatibonza.app.models.services;

import java.util.List;

import com.gguatibonza.app.models.entities.Logro;
import com.gguatibonza.app.models.entities.Objetivo;

/**
 * @author gian
 *
 */
public interface IObjetivoService {

	public List<Objetivo> findAll();

	public Objetivo findById(Long id);

	public boolean existId(Long id);

	public List<Objetivo> findAllByLogro(Logro logro);

}
