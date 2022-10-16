package com.gestionprojet.service;

import java.util.List;


import com.gestionprojet.dao.DemandeDao;
import com.gestionprojet.dao.DemandeDaoImpl;
import com.gestionprojet.dao.entity.Demande;

public class DemandeServiceImpl implements DemandeService {
	DemandeDao dao = new DemandeDaoImpl();
	@Override
	public void add(Demande e) {
		// TODO Auto-generated method stub
		dao.add(e);
	}

	@Override
	public Demande edit(Demande e) {
		// TODO Auto-generated method stub
		return dao.edit(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public List<Demande> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Demande findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}
	
}
