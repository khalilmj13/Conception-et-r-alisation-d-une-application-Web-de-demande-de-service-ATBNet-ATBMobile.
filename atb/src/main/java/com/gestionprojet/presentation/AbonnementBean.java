package com.gestionprojet.presentation;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="AbonnementBean")
@RequestScoped
public class AbonnementBean {
	private String login;
	private String mdp;
	private  Date date_creation;
	private int bn_client;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public int getBn_client() {
		return bn_client;
	}
	public void setBn_client(int bn_client) {
		this.bn_client = bn_client;
	}
	
}
