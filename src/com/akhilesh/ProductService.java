package com.akhilesh;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/product")
public class ProductService{
 	@POST
 	@Path("/add")
 	@Produces(MediaType.TEXT_HTML)
	public Response addUser(
		@FormParam("id") int id,
		@FormParam("name") String name,
		@FormParam("price") float price) {
 
		return Response.status(200)
			.entity(" Product added successfuly!<br> Id: "+id+"<br> Name: " + name+"<br> Price: "+price)
			.build();
 	}
}