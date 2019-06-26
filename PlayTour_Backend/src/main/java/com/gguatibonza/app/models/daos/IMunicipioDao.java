/**
 * 
 */
package com.gguatibonza.app.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gguatibonza.app.models.entities.Municipio;

/**
 * @author gian
 *
 */
public interface IMunicipioDao extends JpaRepository<Municipio, Long> {

}
