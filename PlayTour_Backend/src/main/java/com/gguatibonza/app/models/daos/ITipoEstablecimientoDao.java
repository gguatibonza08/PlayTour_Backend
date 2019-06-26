/**
 * 
 */
package com.gguatibonza.app.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gguatibonza.app.models.entities.TipoEstablecimiento;

/**
 * @author gian
 *
 */
public interface ITipoEstablecimientoDao extends JpaRepository<TipoEstablecimiento, Long> {

}
