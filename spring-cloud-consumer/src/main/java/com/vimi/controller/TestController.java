package com.vimi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	HelloRemote hello;
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
	return	hello.hello(name);
	}
	
}
