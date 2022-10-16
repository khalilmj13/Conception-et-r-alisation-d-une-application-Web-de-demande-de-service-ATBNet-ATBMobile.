package com.gestionprojet.dao.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="abonnement")
public class Abonnement  implements Serializable	{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	@Column(name = "id", unique = true, nullable = false, precision = 15, scale = 0)
	@Id
	private Long id_abonnement;
	private String login;
	private String mdp;
	private  Date date_creation;
	private int bn_client;
	

	public Abonnement() {
		super();
	}

	public Abonnement(String login, String mdp, Date date_creation, int bn_client, long id_abonnement) {
	    super();
	    this.login = login;
	    this.mdp = mdp;
	    this.date_creation = date_creation;
	    this.bn_client = bn_client;
	    this.id_abonnement = id_abonnement;
	}

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

	public java.util.Date getDate_creation() {
	    return date_creation;
	}

	public void setDate_creation(java.util.Date date_creation) {
	    this.date_creation = date_creation;
	}

	public int getBn_client() {
	    return bn_client;
	}

	public void setBn_client(int bn_client) {
	    this.bn_client = bn_client;
	}

	public long getId_abonnement() {
	    return id_abonnement;
	}

	public void setId_abonnement(long id_abonnement) {
	    this.id_abonnement = id_abonnement;
	}

	@Override
	public String toString() {
	    return "Abonnement [login=" + login + ", mdp=" + mdp + ", date_creation=" + date_creation + ", bn_client="
	            + bn_client + ", id_abonnement=" + id_abonnement + "]";
	}

}
