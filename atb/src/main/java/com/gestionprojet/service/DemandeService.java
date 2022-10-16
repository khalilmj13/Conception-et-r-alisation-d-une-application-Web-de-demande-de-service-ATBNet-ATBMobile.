package com.gestionprojet.service;

import java.util.List;

//import com.gestionprojet.dao.entity.Client;
import com.gestionprojet.dao.entity.Demande;

public interface DemandeService {
	public void add(Demande e);
	public Demande edit(Demande e);
	public void delete(Long id);
	public List<Demande> findAll();
	public Demande findById(Long id);
}
