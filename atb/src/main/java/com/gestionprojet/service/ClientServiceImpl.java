package com.gestionprojet.service;

import java.util.List;

import com.gestionprojet.dao.ClientDao;
import com.gestionprojet.dao.ClientDaoImpl;
import com.gestionprojet.dao.entity.Client;

public class ClientServiceImpl implements ClientService {
	ClientDao dao = new ClientDaoImpl();
	@Override
	public void add(Client e) {
		// TODO Auto-generated method stub
		dao.add(e);
	}

	@Override
	public Client edit(Client e) {
		// TODO Auto-generated method stub
		return dao.edit(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}
	
	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();	
	}

	@Override
	public Client findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

}
