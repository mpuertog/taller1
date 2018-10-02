package co.edu.uniandes.ejb;

import javax.ejb.Local;

import co.edu.uniandes.entities.Operador;
import co.edu.uniandes.entities.OperadorCiudadano;

@Local
public interface OperadorEJB {

	public void actualizarOperadorCiudadano(String idOperador, long idCiudadano);

	public Operador consultarOperador(String idOperador);

	public OperadorCiudadano consultarOperadorCiudadano(long idCiudadano);

}
