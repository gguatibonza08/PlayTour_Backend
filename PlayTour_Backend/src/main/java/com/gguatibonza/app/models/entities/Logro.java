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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "logros")
public class Logro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "logro_id")
	private Long logroId;

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String descripcion;

	@NotEmpty
	@Column(name = "foto_obtenido")
	private String fotoObtenido;

	@NotEmpty
	@Column(name = "foto_por_defecto")
	private String fotoPorDefecto;

	@JoinTable(name = "logros_objetivos", joinColumns = { @JoinColumn(name = "logro_id") }, inverseJoinColumns = {
			@JoinColumn(name = "objetivo_id") }

	)
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Objetivo> objetivos;

	@OneToMany(mappedBy = "logro", fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<UsuarioLogro> usuariosLogro;

	/**
	 * 
	 */
	public Logro() {
		this.objetivos = new ArrayList<Objetivo>();
		this.usuariosLogro = new ArrayList<UsuarioLogro>();
	}

	/**
	 * @return the logroId
	 */
	public Long getLogroId() {
		return logroId;
	}

	/**
	 * @param logroId the logroId to set
	 */
	public void setLogroId(Long logroId) {
		this.logroId = logroId;
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
	 * @return the fotoObtenido
	 */
	public String getFotoObtenido() {
		return fotoObtenido;
	}

	/**
	 * @param fotoObtenido the fotoObtenido to set
	 */
	public void setFotoObtenido(String fotoObtenido) {
		this.fotoObtenido = fotoObtenido;
	}

	/**
	 * @return the fotoPorDefecto
	 */
	public String getFotoPorDefecto() {
		return fotoPorDefecto;
	}

	/**
	 * @param fotoPorDefecto the fotoPorDefecto to set
	 */
	public void setFotoPorDefecto(String fotoPorDefecto) {
		this.fotoPorDefecto = fotoPorDefecto;
	}

	/**
	 * @return the objetivos
	 */
	public List<Objetivo> getObjetivos() {
		return objetivos;
	}

	/**
	 * @param objetivos the objetivos to set
	 */
	public void setObjetivos(List<Objetivo> objetivos) {
		this.objetivos = objetivos;
	}

	/**
	 * @return the usuariosLogro
	 */
	public List<UsuarioLogro> getUsuariosLogro() {
		return usuariosLogro;
	}

	/**
	 * @param usuariosLogro the usuariosLogro to set
	 */
	public void setUsuariosLogro(List<UsuarioLogro> usuariosLogro) {
		this.usuariosLogro = usuariosLogro;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void addObjetivos(Objetivo item) {
		this.objetivos.add(item);
	}

	public void addUsuarios(UsuarioLogro item) {
		this.usuariosLogro.add(item);
	}

}
