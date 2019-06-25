/**
 * 
 */
package com.gguatibonza.app.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gguatibonza.app.models.entities.Objetivo;

/**
 * @author gian
 *
 */
public interface IObjetivoDao extends JpaRepository<Objetivo, Long> {

}
