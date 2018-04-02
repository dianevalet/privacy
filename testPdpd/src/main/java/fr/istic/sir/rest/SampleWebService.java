package fr.istic.sir.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/hello")
public class SampleWebService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello, how are you?";
	}

	/*
	@GET  /* requete rest pour recuperer la donnee et l'afficher au format  JSON 
	@Path("/home")
	/*
	@Produces(MediaType.APPLICATION_JSON) 
	public Home getHome() {
	
		Home h = new Home();
		h.setAdresse("44 rue Baulieu");
		
		Heater h1 = new Heater();
		h1.setDegre("500w");
		Heater h2 = new Heater();
		h2.setDegre("600w");
		
		h.addHeater(h1);
		h.addHeater(h2);
		return h;

	}*/

	
}

