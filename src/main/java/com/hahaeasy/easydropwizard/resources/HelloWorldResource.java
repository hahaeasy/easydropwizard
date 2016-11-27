package com.hahaeasy.easydropwizard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by tonyxue on 11/27/16.
 */
@Path("/helloworld/{name}")
public class HelloWorldResource {

	@GET
	public String getHelloWorld(@PathParam("name") String name) {

		return "Hello world, welcome " + name;

	}
}

