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
	public String getIt(@QueryParam("q") String q, @QueryParam("start") String start) throws Exception {
		String urlStr = "https://www.googleapis.com/customsearch/v1element?key=AIzaSyCVAXiUzRYsML1Pv6RwSG1gunmMikTzQqY&rsz=filtered_cse&num=10&hl=zh_CN&prettyPrint=false&source=gcsc&gss=.com&sig=432dd570d1a386253361f581254f9ca1&start="
				+ start + "&cx=002888546953948157320:bahxnr-mq7i&q=" + q + "&sort=&googlehost=www.google.com";
		Response response = Request.Get(urlStr).execute();
		return response.returnContent().asString(StandardCharsets.UTF_8);
	}

}
