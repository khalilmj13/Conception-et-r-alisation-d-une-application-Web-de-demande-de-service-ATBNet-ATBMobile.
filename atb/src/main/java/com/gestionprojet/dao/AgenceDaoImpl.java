package com.gestionprojet.dao;

import java.util.List;

import org.hibernate.Session;

import com.gestionprojet.dao.entity.Agence;
//import com.gestionprojet.dao.entity.Client;
import com.gestionprojet.utils.HibernateUtil;

public class AgenceDaoImpl implements AgenceDao {
	Session session = HibernateUtil.openSession();

	@Override
	public void add(Agence a) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		 session.save(a);
		session.getTransaction().commit();
	}

	@Override
	public Agence edit(Agence a) {
		session.beginTransaction();
		Agence c = (Agence) session.merge(a);
		session.getTransaction().commit();
		return c;
	}

	@Override
	public void delete(Long id) {
		session.beginTransaction();
		Agence c = findById(id);
		session.delete(c);
		session.getTransaction().commit();
	}

	@Override
	public List<Agence> findAll() {
		// TODO Auto-generated method stub
		 return session.createQuery("select o from Agence o").list();
	}

	@Override
	public Agence findById(Long id) {
		// TODO Auto-generated method stub
		return (Agence) session.get(Agence.class, id);
	}

}
