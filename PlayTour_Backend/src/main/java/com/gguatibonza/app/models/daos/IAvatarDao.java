/**
 * 
 */
package com.gguatibonza.app.models.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gguatibonza.app.models.entities.Avatar;
import com.gguatibonza.app.models.entities.Ruta;

/**
 * @author gian
 *
 */
public interface IAvatarDao extends JpaRepository<Avatar, Long> {

	public List<Avatar> findByRuta(Ruta ruta);

}
