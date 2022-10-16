package com.gestionprojet.dao;

import java.util.List;

import com.gestionprojet.dao.entity.Demande;

public interface DemandeDao {
	public void add(Demande a);
	public Demande edit(Demande a);
	public void delete(Long id);
	public List<Demande> findAll();
	public Demande findById(Long id);
}
