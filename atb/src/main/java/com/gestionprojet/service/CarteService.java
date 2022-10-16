package com.gestionprojet.service;

import java.util.List;

import com.gestionprojet.dao.entity.Carte;
//import com.gestionprojet.dao.entity.Client;

public interface CarteService {
	public void add(Carte e);
	public Carte edit(Carte e);
	public void delete(Long id);
	public List<Carte> findAll();
	public Carte findById(Long id);
}
