/**
 * 
 */
package com.gguatibonza.app.models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author gian
 *
 */
@Table(name = "rutas")
@Entity
public class Ruta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ruta_id")
	private Long rutaId;

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String descripcion;

	@NotEmpty
	private String foto;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "municipio")
	private Municipio municipio;

	@OneToMany(mappedBy = "ruta", fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Avatar> avatares;

	/**
	 * 
	 */
	public Ruta() {
		this.avatares = new ArrayList<Avatar>();
	}

	/**
	 * @return the rutaId
	 */
	public Long getRutaId() {
		return rutaId;
	}

	/**
	 * @param rutaId the rutaId to set
	 */
	public void setRutaId(Long rutaId) {
		this.rutaId = rutaId;
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
	 * @return the municipio
	 */
	public Municipio getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	/**
	 * @return the avatares
	 */
	public List<Avatar> getAvatares() {
		return avatares;
	}

	/**
	 * @param avatares the avatares to set
	 */
	public void setAvatares(List<Avatar> avatares) {
		this.avatares = avatares;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void addAvatares(Avatar item) {
		this.avatares.add(item);
	}

}
