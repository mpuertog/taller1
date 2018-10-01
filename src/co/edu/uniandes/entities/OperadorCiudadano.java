package co.edu.uniandes.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the OPERADOR_CIUDADANO database table.
 * 
 */
@Entity
@Table(name = "OPERADOR_CIUDADANO")
@NamedQuery(name = "OperadorCiudadano.findAll", query = "SELECT o FROM OperadorCiudadano o")
public class OperadorCiudadano implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_CIUDADANO")
	private long idCiudadano;

	// bi-directional many-to-one association to Operador
	@ManyToOne
	@JoinColumn(name = "ID_OPERADOR")
	private Operador operador;

	public OperadorCiudadano() {
	}

	public long getIdCiudadano() {
		return this.idCiudadano;
	}

	public void setIdCiudadano(long idCiudadano) {
		this.idCiudadano = idCiudadano;
	}

	public Operador getOperador() {
		return this.operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}

}