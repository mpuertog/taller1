package co.edu.uniandes.ejb;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import co.edu.uniandes.entities.Operador;
import co.edu.uniandes.entities.OperadorCiudadano;
import co.edu.uniandes.persistance.OperadorCiudadanoDAO;
import co.edu.uniandes.persistance.OperadoresDAO;

@Stateless
public class OperadorEJBImpl implements OperadorEJB {

	@EJB
	private OperadoresDAO operadoresDAO;

	@EJB
	private OperadorCiudadanoDAO operadoresCiudadanoDAO;

	@Override
	public void registroCiudadanoEnOperador(String idOperador, long idCiudadano) {
		Operador operador = consultarOperador(idOperador);
		if (operador == null) {
			operador = new Operador();
			operador.setId(idOperador);
			operador.setUrl("urlOperador");
		}
		OperadorCiudadano operadorCiudadano = new OperadorCiudadano();
		operadorCiudadano.setIdCiudadano(idCiudadano);
		operadorCiudadano.setOperador(operador);
		operadoresCiudadanoDAO.actualizarOperadorCiudadano(operadorCiudadano);

	}

	@Override
	public Operador consultarOperador(String idOperador) {
		return operadoresDAO.consultarOperador(idOperador);
	}

	@Override
	public OperadorCiudadano consultarOperadorCiudadano(long idCiudadano) {
		return operadoresCiudadanoDAO.consultarOperadorCiudadano(idCiudadano);
	}

}
