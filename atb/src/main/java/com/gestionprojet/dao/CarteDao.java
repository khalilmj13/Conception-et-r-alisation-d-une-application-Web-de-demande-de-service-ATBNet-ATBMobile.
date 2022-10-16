package com.gestionprojet.dao;

import java.util.List;

import com.gestionprojet.dao.entity.Carte;

public interface CarteDao {
	public void add(Carte c);
	public Carte edit(Carte c);
	public void delete(Long id);
	public List<Carte> findAll();
	public Carte findById(Long id);
}
