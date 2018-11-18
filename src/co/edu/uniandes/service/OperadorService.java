package co.edu.uniandes.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import co.edu.uniandes.ejb.OperadorEJB;
import co.edu.uniandes.entities.OperadorCiudadano;

@Stateless
@Path("/operadorService")
public class OperadorService {

	@EJB
	private OperadorEJB operadorEJB;

	@GET
	@Path("/consultarOperadorCiudadano/{idCiudadano}")
	@Produces("application/json")
	public Response consultarOperadorCiudadano(@PathParam("idCiudadano") Long idCiudadano) {
		JSONObject jsonObject = new JSONObject();
		String result = null;
		OperadorCiudadano operadorCiudadano = operadorEJB.consultarOperadorCiudadano(idCiudadano);
		if (operadorCiudadano != null) {
			jsonObject.put("idOperador", operadorCiudadano.getOperador().getId());
			jsonObject.put("idCiudadano", operadorCiudadano.getIdCiudadano());
			result = jsonObject.toString();
		} else {
			jsonObject.put("mensaje", "no encontrado");
			result = jsonObject.toString();
		}
		return Response.status(200).entity(result).build();
	}

	@POST
	@Path("/actualizarOperadorCiudadano/{idCiudadano}/{idOperador}")
	@Produces("application/json")
	public Response actualizarOperadorCiudadano(@PathParam("idCiudadano") Long idCiudadano,
			@PathParam("idOperador") String idOperador) {
		JSONObject jsonObject = new JSONObject();
		String result = null;
		if (idCiudadano != null && idOperador != null) {
			operadorEJB.actualizarOperadorCiudadano(idOperador, idCiudadano);
			jsonObject.put("idCiudadano", idCiudadano);
			jsonObject.put("idOperador", idOperador);
			result = jsonObject.toString();
		} else {
			jsonObject.put("mensaje", "no actualizado");
			result = jsonObject.toString();
		}
		return Response.status(200).entity(result).build();
	}

}
