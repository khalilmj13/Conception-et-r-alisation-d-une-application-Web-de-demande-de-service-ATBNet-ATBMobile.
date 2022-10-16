package com.gestionprojet.service;

import java.util.List;

import com.gestionprojet.dao.entity.Client;

public interface ClientService {
	public void add(Client e);
	public Client edit(Client e);
	public void delete(Long id);
	public List<Client> findAll();
	public Client findById(Long id);
}
