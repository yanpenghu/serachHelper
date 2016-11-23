package com.coco.searchhelper;

import java.nio.charset.StandardCharsets;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;

@Path("search")
public class HttpResource {

	@GET
	@Produces(MediaType.WILDCARD)
	public String getIt(@QueryParam("url") String url) throws Exception {
		Response response = Request.Get(url).execute();
		return response.returnContent().asString(StandardCharsets.UTF_8);
	}

}
