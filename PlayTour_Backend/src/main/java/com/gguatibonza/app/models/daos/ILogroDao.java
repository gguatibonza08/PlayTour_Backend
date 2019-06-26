/**
 * 
 */
package com.gguatibonza.app.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gguatibonza.app.models.entities.Logro;

/**
 * @author gian
 *
 */
public interface ILogroDao extends JpaRepository<Logro, Long> {

}
