package com.mywebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybusiness.business.service.ClientService;

@RestController
public class FirstController {

	@Autowired
	private ClientService clientService;
	
	@RequestMapping("hello")
	public String hello(){
		//return "hiiii";
		String result = "";
		try{
			result = clientService.getClass().toString();
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
}
