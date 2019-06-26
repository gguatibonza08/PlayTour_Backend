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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usuario_id")
	private Long usuarioId;

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String apelldio;

	@NotEmpty
	@Email
	private String correo;

	@NotEmpty
	private String contrasena;

	@NotEmpty
	@Column(name = "user_name")
	private String username;

	@NotEmpty
	private String telefono;

	@NotEmpty
	private String foto;

	@JoinTable(name = "usuarios_municipios", joinColumns = { @JoinColumn(name = "usuario_id") }, inverseJoinColumns = {
			@JoinColumn(name = "municipio_id") }

	)
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Municipio> municipios;

	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<FotoMunicipioUsuario> fotos;

	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<UsuarioLogro> logrosUsuario;

	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<UsuarioObjetivo> objetivosUsuario;

	/**
	 *
	 */
	public Usuario() {
		this.municipios = new ArrayList<Municipio>();
		this.fotos = new ArrayList<FotoMunicipioUsuario>();
		this.objetivosUsuario = new ArrayList<UsuarioObjetivo>();
		this.logrosUsuario = new ArrayList<UsuarioLogro>();
	}

	/**
	 * @return the usuarioId
	 */
	public Long getUsuarioId() {
		return usuarioId;
	}

	/**
	 * @param usuarioId the usuarioId to set
	 */
	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
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
	 * @return the apelldio
	 */
	public String getApelldio() {
		return apelldio;
	}

	/**
	 * @param apelldio the apelldio to set
	 */
	public void setApelldio(String apelldio) {
		this.apelldio = apelldio;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
	 * @return the municipios
	 */
	public List<Municipio> getMunicipios() {
		return municipios;
	}

	/**
	 * @param municipios the municipios to set
	 */
	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}

	/**
	 * @return the fotos
	 */
	public List<FotoMunicipioUsuario> getFotos() {
		return fotos;
	}

	/**
	 * @param fotos the fotos to set
	 */
	public void setFotos(List<FotoMunicipioUsuario> fotos) {
		this.fotos = fotos;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void addFotos(FotoMunicipioUsuario item) {
		this.fotos.add(item);
	}

	public void addMunicipios(Municipio item) {
		this.municipios.add(item);
	}

	public void addObjetivos(UsuarioObjetivo item) {
		this.objetivosUsuario.add(item);
	}

	public void addLogros(UsuarioLogro item) {
		this.logrosUsuario.add(item);
	}
}
