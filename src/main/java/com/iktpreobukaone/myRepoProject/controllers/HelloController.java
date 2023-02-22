package com.iktpreobukaone.myRepoProject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String returnHello() {
		return"Hello World!!!";
	}

}
