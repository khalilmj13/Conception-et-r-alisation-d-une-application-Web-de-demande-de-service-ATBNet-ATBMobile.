package com.gestionprojet.presentation;

import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;

import com.gestionprojet.dao.entity.Abonnement;
import com.gestionprojet.utils.HibernateUtil;

@ManagedBean(name="LoginBean")
@SessionScoped
public class LoginBean {
	Abonnement ab = new Abonnement();
	Abonnement loginab = new Abonnement();
	private Boolean login = false;
	
	public Abonnement getAb() {
		return ab;
	}

	public void setAb(Abonnement ab) {
		this.ab = ab;
	}

	public Boolean getLogin() {
		return login;
	}

	public void setLogin(Boolean login) {
		this.login = login;
	}
	
	public Abonnement getLoginab() {
		return loginab;
	}

	public void setLoginab(Abonnement loginab) {
		this.loginab = loginab;
	}

	public String checkAbonnement() {
		Session session =HibernateUtil.getSessionFactory().openSession();
		Abonnement a = (Abonnement) session.get(Abonnement.class, ab.getId_abonnement());
		if(a!= null && a.getMdp().equals(ab.getMdp())) {
			loginab.setId_abonnement(a.getId_abonnement());
			loginab.setMdp(a.getMdp());
			login = true;
			return "Login";
		}
		return "Fail";
	}
	public LoginBean() {
		
	}
}
