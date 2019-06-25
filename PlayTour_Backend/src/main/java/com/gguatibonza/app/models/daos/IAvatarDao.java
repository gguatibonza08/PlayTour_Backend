/**
 * 
 */
package com.gguatibonza.app.models.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gguatibonza.app.models.entities.Avatar;

/**
 * @author gian
 *
 */
public interface IAvatarDao extends JpaRepository<Avatar, Long> {

}
