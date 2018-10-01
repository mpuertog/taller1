package co.edu.uniandes.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * The persistent class for the OPERADOR database table.
 * 
 */
@Entity
@NamedQuery(name = "Operador.findAll", query = "SELECT o FROM Operador o")
public class Operador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String tipo;

	private String url;

	// bi-directional many-to-one association to OperadorCiudadano
	@OneToMany(mappedBy = "operador")
	private List<OperadorCiudadano> operadorCiudadanos;

	public Operador() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<OperadorCiudadano> getOperadorCiudadanos() {
		return this.operadorCiudadanos;
	}

	public void setOperadorCiudadanos(List<OperadorCiudadano> operadorCiudadanos) {
		this.operadorCiudadanos = operadorCiudadanos;
	}

	public OperadorCiudadano addOperadorCiudadano(OperadorCiudadano operadorCiudadano) {
		getOperadorCiudadanos().add(operadorCiudadano);
		operadorCiudadano.setOperador(this);

		return operadorCiudadano;
	}

	public OperadorCiudadano removeOperadorCiudadano(OperadorCiudadano operadorCiudadano) {
		getOperadorCiudadanos().remove(operadorCiudadano);
		operadorCiudadano.setOperador(null);

		return operadorCiudadano;
	}

}