/**
 * 
 */
package com.gguatibonza.app.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author gian
 *
 */
@Table(name = "tipo_Establecimiento")
@Entity
public class TipoEstablecimiento implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tipo_establecimiento_id")
	private Long TipoEstablecimientoId;

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String descripcion;

	/**
	 * 
	 */
	public TipoEstablecimiento() {
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return TipoEstablecimientoId;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.TipoEstablecimientoId = id;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
