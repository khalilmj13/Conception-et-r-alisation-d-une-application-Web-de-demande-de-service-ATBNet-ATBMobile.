package com.gestionprojet.dao;

import java.util.List;

import org.hibernate.Session;

import com.gestionprojet.dao.entity.Carte;
import com.gestionprojet.dao.entity.Client;
import com.gestionprojet.dao.entity.Compte;
import com.gestionprojet.utils.HibernateUtil;

public class CompteDaoImpl implements CompteDao {
	Session session = HibernateUtil.openSession();

	@Override
	public void add(Compte c) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		 session.save(c);
		session.getTransaction().commit();
	}

	@Override
	public Compte edit(Compte c) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		Compte e = (Compte) session.merge(c);
		session.getTransaction().commit();
		return e;

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		Compte c = findById(id);
		session.delete(c);
		session.getTransaction().commit();
	}

	@Override
	public List<Compte> findAll() {
		// TODO Auto-generated method stub
		return session.createQuery("select o from Compte o").list();
	}

	@Override
	public Compte findById(Long id) {
		// TODO Auto-generated method stub
		return (Compte) session.get(Compte.class, id);
	}

}
