/**
 * 
 */
package com.gguatibonza.app.models.services;

import java.util.List;

import com.gguatibonza.app.models.entities.Municipio;
import com.gguatibonza.app.models.entities.Ruta;

/**
 * @author gian
 *
 */
public interface IRutaService {

	public List<Ruta> findAll();

	public List<Ruta> findAllByMunicipio(Municipio municipio);

}
