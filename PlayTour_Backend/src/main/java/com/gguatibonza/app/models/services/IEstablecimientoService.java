/**
 * 
 */
package com.gguatibonza.app.models.services;

import java.util.List;

import com.gguatibonza.app.models.entities.Establecimiento;
import com.gguatibonza.app.models.entities.Municipio;
import com.gguatibonza.app.models.entities.TipoEstablecimiento;

/**
 * @author gian
 *
 */
public interface IEstablecimientoService {

	public List<Establecimiento> findByTipoAndMunicipioOrderByName(TipoEstablecimiento tipoEstablecimiento,
			Municipio municipio);

	public void crearEstablecimiento(Establecimiento establecimiento);

	public void eliminarEstablecimiento(int idEstablecimiento);

	public Establecimiento findOne(Establecimiento establecimiento);

	public boolean existById(Long id);

}
