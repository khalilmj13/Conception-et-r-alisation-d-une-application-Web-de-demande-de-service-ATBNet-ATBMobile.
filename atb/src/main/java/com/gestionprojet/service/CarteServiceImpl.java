package com.gestionprojet.service;

import java.util.List;

import com.gestionprojet.dao.CarteDao;
import com.gestionprojet.dao.CarteDaoImpl;
//import com.gestionprojet.dao.ClientDao;
//import com.gestionprojet.dao.ClientDaoImpl;
import com.gestionprojet.dao.entity.Carte;

public class CarteServiceImpl implements CarteService{
	CarteDao dao = new CarteDaoImpl();
	@Override
	public void add(Carte e) {
		// TODO Auto-generated method stub
		dao.add(e);
	}

	@Override
	public Carte edit(Carte e) {
		// TODO Auto-generated method stub
		return dao.edit(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public List<Carte> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Carte findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

}
