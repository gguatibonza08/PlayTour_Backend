/**
 * 
 */
package com.gguatibonza.app.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gguatibonza.app.models.entities.Pais;

/**
 * @author gian
 *
 */
public interface IPaisDao extends JpaRepository<Pais, Long> {

}
