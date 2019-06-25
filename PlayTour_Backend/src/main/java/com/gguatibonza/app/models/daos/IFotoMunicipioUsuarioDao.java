/**
 * 
 */
package com.gguatibonza.app.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gguatibonza.app.models.entities.FotoMunicipioUsuario;

/**
 * @author gian
 *
 */
public interface IFotoMunicipioUsuarioDao extends JpaRepository<FotoMunicipioUsuario, Long> {

}
