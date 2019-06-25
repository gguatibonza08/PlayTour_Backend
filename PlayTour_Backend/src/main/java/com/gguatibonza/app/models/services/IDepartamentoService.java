/**
 * 
 */
package com.gguatibonza.app.models.services;

import java.util.List;

import com.gguatibonza.app.models.entities.Departamento;
import com.gguatibonza.app.models.entities.Pais;

/**
 * @author gian
 *
 */
public interface IDepartamentoService {

	public List<Departamento> findByPaisOrderByName(Pais pais);

	public List<Departamento> findAllOrderByName();

	public Departamento findById(Long id);

	public boolean existId(Long id);

}
