package com.gestionprojet.dao;

import java.util.List;

import com.gestionprojet.dao.entity.Client;
import com.gestionprojet.dao.entity.Compte;

public interface CompteDao {
	public void add(Compte c);
	public Compte edit(Compte c);
	public void delete(Long id);
	public List<Compte> findAll();
	public Compte findById(Long id);
}
