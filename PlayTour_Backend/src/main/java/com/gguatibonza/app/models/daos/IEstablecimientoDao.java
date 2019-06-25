/**
 * 
 */
package com.gguatibonza.app.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gguatibonza.app.models.entities.Establecimiento;

/**
 * @author gian
 *
 */
public interface IEstablecimientoDao extends JpaRepository<Establecimiento, Long> {

}
