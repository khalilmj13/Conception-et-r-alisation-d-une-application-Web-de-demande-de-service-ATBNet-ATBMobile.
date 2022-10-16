package com.gestionprojet.dao;

import java.util.List;

import org.hibernate.Session;

import com.gestionprojet.dao.entity.Client;
import com.gestionprojet.utils.HibernateUtil;

public class ClientDaoImpl implements ClientDao {
	Session session = HibernateUtil.openSession();
	@Override
	public void add(Client e) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		 session.save(e);
		session.getTransaction().commit();
  		
	}

	@Override
	public Client edit(Client e) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		Client c = (Client) session.merge(e);
		session.getTransaction().commit();
		return c;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		Client c = findById(id);
		session.delete(c);
		session.getTransaction().commit();	
		
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return session.createQuery("select o from Client o").list();
	}

	@Override
	public Client findById(Long id) {
		// TODO Auto-generated method stub
		return (Client) session.get(Client.class, id);
	}

}
