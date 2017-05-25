package com.mybusiness.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybusiness.business.dao.ClientDAO;
import com.mybusiness.business.model.Client;
import com.mybusiness.business.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	private ClientDAO clientDAO;
	
	public List<Client> getClients(){
		return clientDAO.getClients();
	}
}
