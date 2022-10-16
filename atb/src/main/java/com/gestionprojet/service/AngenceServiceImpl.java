package com.gestionprojet.service;

import java.util.List;

import com.gestionprojet.dao.AgenceDao;
import com.gestionprojet.dao.AgenceDaoImpl;
import com.gestionprojet.dao.entity.Agence;

public class AngenceServiceImpl implements AgenceService{
	AgenceDao dao = new AgenceDaoImpl();
	@Override
	public void add(Agence a) {
		// TODO Auto-generated method stub
		dao.add(a);
	}

	@Override
	public Agence edit(Agence a) {
		// TODO Auto-generated method stub
		return dao.edit(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public List<Agence> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Agence findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

}
