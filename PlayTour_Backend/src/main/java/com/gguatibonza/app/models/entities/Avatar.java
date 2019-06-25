/**
 * 
 */
package com.gguatibonza.app.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author gian
 *
 */
@Table(name = "avatares")
@Entity
public class Avatar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "avatar_id")
	private Long avatarId;

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String foto;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ruta")
	private Ruta ruta;

	/**
	 * 
	 */
	public Avatar() {
	}

	/**
	 * @return the avatarId
	 */
	public Long getAvatarId() {
		return avatarId;
	}

	/**
	 * @param avatarId the avatarId to set
	 */
	public void setAvatarId(Long avatarId) {
		this.avatarId = avatarId;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}

	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}

	/**
	 * @return the ruta
	 */
	public Ruta getRuta() {
		return ruta;
	}

	/**
	 * @param ruta the ruta to set
	 */
	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
