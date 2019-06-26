/**
 * 
 */
package com.gguatibonza.app.models.services.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gguatibonza.app.models.entities.Establecimiento;
import com.gguatibonza.app.models.entities.FotoEstablecimiento;
import com.gguatibonza.app.models.services.IFotoEstablecimientoService;

/**
 * @author gian
 *
 */
@Service
public class FotoEstablecimientoImplements implements IFotoEstablecimientoService {

	@Override
	public boolean existById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void guardarFoto(FotoEstablecimiento fotoEstablecimiento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarFoto(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<FotoEstablecimiento> findAllByEstablecimeinto(Establecimiento establecimiento) {
		// TODO Auto-generated method stub
		return null;
	}

}
