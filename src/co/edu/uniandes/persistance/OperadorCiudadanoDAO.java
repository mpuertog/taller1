package co.edu.uniandes.persistance;

import javax.ejb.Local;

import co.edu.uniandes.entities.OperadorCiudadano;

@Local
public interface OperadorCiudadanoDAO {

	public OperadorCiudadano consultarOperadorCiudadano(long idCiudadano);

	public void actualizarOperadorCiudadano(OperadorCiudadano operadorCiudadano);

}
