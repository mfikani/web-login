package com.mybusiness.business.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mybusiness.business.dao.ClientDAO;
import com.mybusiness.business.model.Client;

@Repository
public class ClientDAOImpl implements ClientDAO{

	public List<Client> getClients(){
		List<Client> clients = new ArrayList<Client>();
		for(int i=1;i<=5;i++){
			Client cl = new Client();
			cl.setId(""+i);
			cl.setName("Name "+i);
			cl.setLastName("LastName "+i);
			
			clients.add(cl);
		}
		return clients;
	}
}
