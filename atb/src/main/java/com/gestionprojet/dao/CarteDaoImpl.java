package com.gestionprojet.dao;

import java.util.List;

import org.hibernate.Session;

import com.gestionprojet.dao.entity.Carte;
//import com.gestionprojet.dao.entity.Client;
import com.gestionprojet.utils.HibernateUtil;

public class CarteDaoImpl implements CarteDao{
	Session session = HibernateUtil.openSession();

	@Override
	public void add(Carte c) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}

	@Override
	public Carte edit(Carte c) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		Carte a = (Carte) session.merge(c);
		session.getTransaction().commit();
		return a;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		Carte c = findById(id);
		session.delete(c);
		session.getTransaction().commit();
	}

	@Override
	public List<Carte> findAll() {
		// TODO Auto-generated method stub
		return session.createQuery("select o from Carte o").list();
	}

	@Override
	public Carte findById(Long id) {
		// TODO Auto-generated method stub
		return (Carte) session.get(Carte.class, id);
	}

}
