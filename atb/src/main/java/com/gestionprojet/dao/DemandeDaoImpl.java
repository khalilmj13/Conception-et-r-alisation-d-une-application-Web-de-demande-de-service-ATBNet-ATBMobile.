package com.gestionprojet.dao;

import java.util.List;

import org.hibernate.Session;

import com.gestionprojet.dao.entity.Compte;
import com.gestionprojet.dao.entity.Demande;
import com.gestionprojet.utils.HibernateUtil;

public class DemandeDaoImpl implements DemandeDao{
	Session session = HibernateUtil.openSession();
	@Override
	public void add(Demande a) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		 session.save(a);
		session.getTransaction().commit();
	}

	@Override
	public Demande edit(Demande a) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		Demande e = (Demande) session.merge(a);
		session.getTransaction().commit();
		return e;
	}

	@Override
	public void delete(Long id) {
		session.beginTransaction();
		Demande c = findById(id);
		session.delete(c);
		
	}

	@Override
	public List<Demande> findAll() {
		return session.createQuery("select o from Demande o").list();
	}

	@Override
	public Demande findById(Long id) {
		// TODO Auto-generated method stub
		return (Demande) session.get(Demande.class, id);
	}

}
