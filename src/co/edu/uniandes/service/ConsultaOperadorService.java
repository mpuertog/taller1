package co.edu.uniandes.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import co.edu.uniandes.ejb.OperadorEJB;
import co.edu.uniandes.entities.OperadorCiudadano;

@Stateless
@Path("/consultaOperador")
public class ConsultaOperadorService {

	@EJB
	private OperadorEJB operadorEJB;

	@Path("{idCiudadano}")
	@GET
	@Produces("application/json")
	public Response consultarOperadorCiudadano(@PathParam("idCiudadano") Long idCiudadano) {
		JSONObject jsonObject = new JSONObject();
		String result = null;
		OperadorCiudadano operadorCiudadano = operadorEJB.consultarOperadorCiudadano(idCiudadano);
		if (operadorCiudadano != null) {
			jsonObject.put("idOperador", operadorCiudadano.getOperador().getId());
			jsonObject.put("idCiudadano", operadorCiudadano.getIdCiudadano());
			result = "@Produces(\"application/json\") IdOperador: \n\nF IdCiudadano: \n\n" + jsonObject;
		} else {
			result = "@Produces(\"application/json\") No se encuentra operador" + jsonObject;
		}

		return Response.status(200).entity(result).build();
	}

}
