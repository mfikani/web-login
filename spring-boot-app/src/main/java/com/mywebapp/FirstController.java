package com.mywebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {

	@RequestMapping("hello")
	public String hello(){
		return "hiiii";
	}
}
