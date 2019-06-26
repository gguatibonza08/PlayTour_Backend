/**
 * 
 */
package com.gguatibonza.app.models.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.ws.rs.DefaultValue;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author gian
 *
 */
@Entity
@Table(name = "usuarios_objetivos")
public class UsuarioObjetivo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usuario_objetivo_id")
	private Long usuarioObjetivoId;

	@Column(name = "get_date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date getDate;

	@DefaultValue(value = "1")
	private int estado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario")
	private Usuario usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "objetivo")
	private Objetivo objetivo;

	/**
	 * 
	 */
	public UsuarioObjetivo() {
	}

	/**
	 * @return the usuarioObjetivoId
	 */
	public Long getUsuarioObjetivoId() {
		return usuarioObjetivoId;
	}

	/**
	 * @param usuarioObjetivoId the usuarioObjetivoId to set
	 */
	public void setUsuarioObjetivoId(Long usuarioObjetivoId) {
		this.usuarioObjetivoId = usuarioObjetivoId;
	}

	/**
	 * @return the getDate
	 */
	public Date getGetDate() {
		return getDate;
	}

	/**
	 * @param getDate the getDate to set
	 */
	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the objetivo
	 */
	public Objetivo getObjetivo() {
		return objetivo;
	}

	/**
	 * @param objetivo the objetivo to set
	 */
	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

}
