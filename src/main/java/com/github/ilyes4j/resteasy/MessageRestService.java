package com.github.ilyes4j.resteasy;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Path("/message")
@Component
public class MessageRestService {

	@Autowired
	public MessageService messageService;

	public MessageRestService() {
		super();
	}

	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response printMessage(@Context ServletContext servletContext, @PathParam("param") String msg) {

		return Response.status(200).entity(messageService.getMessage()).build();
	}
}
