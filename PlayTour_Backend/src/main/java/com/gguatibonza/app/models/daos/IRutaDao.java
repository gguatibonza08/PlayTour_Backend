/**
 * 
 */
package com.gguatibonza.app.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gguatibonza.app.models.entities.Ruta;

/**
 * @author gian
 *
 */
public interface IRutaDao extends JpaRepository<Ruta, Long> {

}
