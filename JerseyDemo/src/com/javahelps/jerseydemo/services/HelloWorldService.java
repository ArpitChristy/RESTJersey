package com.javahelps.jerseydemo.services;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/sayhello")
public class HelloWorldService {
	@GET
	@Path("/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response sayHello(@PathParam("name") String msg) {
		System.out.println("echo");
		String output = "hello, "+msg+ "!";
		return Response.status(200).entity(output).build();
	}
}
