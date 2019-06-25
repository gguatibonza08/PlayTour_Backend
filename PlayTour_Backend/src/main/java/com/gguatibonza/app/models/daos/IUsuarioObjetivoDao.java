/**
 * 
 */
package com.gguatibonza.app.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gguatibonza.app.models.entities.UsuarioObjetivo;

/**
 * @author gian
 *
 */
public interface IUsuarioObjetivoDao extends JpaRepository<UsuarioObjetivo, Long> {

}
