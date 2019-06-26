package com.gguatibonza.app.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gguatibonza.app.models.entities.FotoEstablecimiento;

/**
 * 
 * @author gian
 *
 */
public interface IFotoEstablecimientoDao extends JpaRepository<FotoEstablecimiento, Long> {

}
