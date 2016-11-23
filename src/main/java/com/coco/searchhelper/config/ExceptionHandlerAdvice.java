package com.coco.searchhelper.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

	@ExceptionHandler(Exception.class)
	public String exception(Exception exception, WebRequest request) {
		exception.printStackTrace();
		return exception.getMessage();
	}
}