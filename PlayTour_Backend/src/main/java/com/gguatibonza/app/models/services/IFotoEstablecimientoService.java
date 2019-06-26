/**
 * 
 */
package com.gguatibonza.app.models.services;

import java.util.List;

import com.gguatibonza.app.models.entities.Establecimiento;
import com.gguatibonza.app.models.entities.FotoEstablecimiento;

/**
 * @author gian
 *
 */
public interface IFotoEstablecimientoService {

	public boolean existById(Long id);

	public void guardarFoto(FotoEstablecimiento fotoEstablecimiento);

	public void eliminarFoto(Long id);

	public List<FotoEstablecimiento> findAllByEstablecimeinto(Establecimiento establecimiento);

}
