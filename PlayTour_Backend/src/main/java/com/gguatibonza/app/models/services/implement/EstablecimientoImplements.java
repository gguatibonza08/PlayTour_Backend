/**
 * 
 */
package com.gguatibonza.app.models.services.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gguatibonza.app.models.entities.Establecimiento;
import com.gguatibonza.app.models.entities.Municipio;
import com.gguatibonza.app.models.entities.TipoEstablecimiento;
import com.gguatibonza.app.models.services.IEstablecimientoService;

/**
 * @author gian
 *
 */
@Service
public class EstablecimientoImplements implements IEstablecimientoService {

	@Override
	public List<Establecimiento> findByTipoAndMunicipioOrderByName(TipoEstablecimiento tipoEstablecimiento,
			Municipio municipio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crearEstablecimiento(Establecimiento establecimiento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarEstablecimiento(int idEstablecimiento) {
		// TODO Auto-generated method stub

	}

	@Override
	public Establecimiento findOne(Establecimiento establecimiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
