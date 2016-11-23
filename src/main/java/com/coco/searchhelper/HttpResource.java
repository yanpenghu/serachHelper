package com.coco.searchhelper;

import java.nio.charset.StandardCharsets;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpResource {

	public static String DOMAIN = "DOMAIN";
	
	@RequestMapping("search")
	public String getIt(HttpServletRequest request,String url) throws Exception {
		if (url.startsWith("http")) {
			request.getSession(true).setAttribute(DOMAIN, url);
		}
		Response response = Request.Get(url).execute();
		return response.returnContent().asString(StandardCharsets.UTF_8);
	}

	@RequestMapping("/")
	public String getOther(HttpServletRequest request,String url) throws Exception {
		if (!url.startsWith("http")) {
			url = request.getSession(true).getAttribute(DOMAIN) + url;
		}
		Response response = Request.Get(url).execute();
		return response.returnContent().asString(StandardCharsets.UTF_8);
	}
}
