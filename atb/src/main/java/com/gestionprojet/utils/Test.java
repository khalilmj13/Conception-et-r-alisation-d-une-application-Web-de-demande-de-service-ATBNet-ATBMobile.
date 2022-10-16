package com.gestionprojet.utils;

import java.util.Date;

import org.hibernate.Session;

import com.gestionprojet.dao.ClientDao;
import com.gestionprojet.dao.ClientDaoImpl;
import com.gestionprojet.dao.entity.Client;

public class Test {
	static Session session = HibernateUtil.openSession();
	public static void main(String[] args) {
		Date date = new Date();
		// TODO Auto-generated method stub
		session.createQuery("select o from Client o").list();
		ClientDao c = new ClientDaoImpl();
		Client p = new Client();
		p.setDate_n(date);
		p.setCin(1113131);
		p.setEmail("khalilm@gmail.com");
		p.setNom("mejbri");
		p.setPrenom("khalil");
		p.setBn_client(123);
		c.add(p);
	}
}
