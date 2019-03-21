package com.demo.client.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConfigController {

	@Value("${hello-word}")
	String hello;

	@RequestMapping(path = "/getHello", method = RequestMethod.GET)
	public String getHello() {
		return hello;
	}

}
