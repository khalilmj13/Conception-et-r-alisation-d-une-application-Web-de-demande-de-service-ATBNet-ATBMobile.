package com.gestionprojet.dao;

import java.util.List;

import com.gestionprojet.dao.entity.Client;

public interface ClientDao {
	public void add(Client e);
	public Client edit(Client e);
	public void delete(Long id);
	public List<Client> findAll();
	public Client findById(Long id);

}
