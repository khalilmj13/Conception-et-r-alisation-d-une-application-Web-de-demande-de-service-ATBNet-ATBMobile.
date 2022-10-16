package com.gestionprojet.service;

import java.util.List;

import com.gestionprojet.dao.entity.Agence;


public interface AgenceService {
	public void add(Agence a);
	public Agence edit(Agence a);
	public void delete(Long id);
	public List<Agence> findAll();
	public Agence findById(Long id);
}
