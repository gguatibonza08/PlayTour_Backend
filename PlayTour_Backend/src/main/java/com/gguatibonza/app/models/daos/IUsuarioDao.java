/**
 * 
 */
package com.gguatibonza.app.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gguatibonza.app.models.entities.Usuario;

/**
 * @author gian
 *
 */
public interface IUsuarioDao extends JpaRepository<Usuario, Long> {

}
