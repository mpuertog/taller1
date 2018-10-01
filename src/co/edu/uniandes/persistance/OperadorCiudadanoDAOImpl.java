package co.edu.uniandes.persistance;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.uniandes.entities.OperadorCiudadano;

@Stateless
public class OperadorCiudadanoDAOImpl implements OperadorCiudadanoDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public OperadorCiudadano consultarOperadorCiudadano(long idCiudadano) {
		return em.find(OperadorCiudadano.class, idCiudadano);
	}

	@Override
	public void actualizarOperadorCiudadano(OperadorCiudadano operadorCiudadano) {
		em.merge(operadorCiudadano);
		em.flush();
	}

}
