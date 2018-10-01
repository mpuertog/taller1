package co.edu.uniandes.persistance;

import javax.ejb.Local;

import co.edu.uniandes.entities.Operador;

@Local
public interface OperadoresDAO {

	public void registroCiudadadoEnOperador(Operador operador);

	public Operador consultarOperador(String idCiudadano);

}
