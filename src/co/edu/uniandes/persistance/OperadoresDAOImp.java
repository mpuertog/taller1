package co.edu.uniandes.persistance;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.uniandes.entities.Operador;

@Stateless
public class OperadoresDAOImp implements OperadoresDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void registroCiudadadoEnOperador(Operador operador) {
		em.merge(operador);
		em.flush();
	}

	@Override
	public Operador consultarOperador(String idCiudadano) {
		return em.find(Operador.class, idCiudadano);
	}

}
