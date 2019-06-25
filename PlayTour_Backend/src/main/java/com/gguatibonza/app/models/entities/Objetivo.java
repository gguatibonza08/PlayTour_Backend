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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "objetivos")
public class Objetivo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "objetivo_id")
	private Long objetivoId;

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String descripcion;

	@NotEmpty
	private String foto;

	@ManyToMany(mappedBy = "objetivos", fetch = FetchType.LAZY)
	private List<Logro> logros;

	@OneToMany(mappedBy = "objetivo", fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<UsuarioObjetivo> usuariosObjetivo;

	/**
	 * 
	 */
	public Objetivo() {
		this.logros = new ArrayList<Logro>();
		this.usuariosObjetivo = new ArrayList<UsuarioObjetivo>();
	}

	/**
	 * @return the objetivoId
	 */
	public Long getObjetivoId() {
		return objetivoId;
	}

	/**
	 * @param objetivoId the objetivoId to set
	 */
	public void setObjetivoId(Long objetivoId) {
		this.objetivoId = objetivoId;
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
	 * @return the logros
	 */
	public List<Logro> getLogros() {
		return logros;
	}

	/**
	 * @param logros the logros to set
	 */
	public void setLogros(List<Logro> logros) {
		this.logros = logros;
	}

	/**
	 * @return the usuariosObjetivo
	 */
	public List<UsuarioObjetivo> getUsuariosObjetivo() {
		return usuariosObjetivo;
	}

	/**
	 * @param usuariosObjetivo the usuariosObjetivo to set
	 */
	public void setUsuariosObjetivo(List<UsuarioObjetivo> usuariosObjetivo) {
		this.usuariosObjetivo = usuariosObjetivo;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void addLogros(Logro item) {
		this.logros.add(item);
	}

	public void addUsuarioObjetivo(UsuarioObjetivo item) {
		this.usuariosObjetivo.add(item);
	}

}
