/**
 * 
 */
package services;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.DaoAdult;
/**
 * @author DIANA
 *
 */
public class ServiceAdult {
	private  DaoAdult dao ;

	public ServiceAdult() {
		this.dao = new DaoAdult();
	}
	
	@GET  /* requete rest pour recuperer la donnee et l'afficher au format  JSON */
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON) 
	public  double getMasseSalariale(){
		return dao.MasseSalariale();
	}

}
