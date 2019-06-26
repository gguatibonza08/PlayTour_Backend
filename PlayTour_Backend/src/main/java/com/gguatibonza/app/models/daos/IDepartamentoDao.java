/**
 * 
 */
package com.gguatibonza.app.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gguatibonza.app.models.entities.Departamento;

/**
 * @author gian
 *
 */
public interface IDepartamentoDao extends JpaRepository<Departamento, Long> {

}
