package com.gestionprojet.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="compte")
public class Compte {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private int num_compte;
	private String etat_compte;
	private double	solde_compte;
	private Carte carte;
	@Column(name = "date_ouverture", nullable = false)
    @Temporal(TemporalType.DATE)
	private Date date_ouverture;
	
	private int bn_client;
	
	public Compte() {
		super();
	}
	
	
	public Compte(Long id, int num_compte, String etat_compte, double solde_compte, Carte carte, Date date_ouverture,
			int bn_client) {
		super();
		this.id = id;
		this.num_compte = num_compte;
		this.etat_compte = etat_compte;
		this.solde_compte = solde_compte;
		this.carte = carte;
		this.date_ouverture = date_ouverture;
		this.bn_client = bn_client;
	}

	
	public Carte getCarte() {
		return carte;
	}


	public void setCarte(Carte carte) {
		this.carte = carte;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNum_compte() {
		return num_compte;
	}
	public void setNum_compte(int num_compte) {
		this.num_compte = num_compte;
	}
	public String getEtat_compte() {
		return etat_compte;
	}
	public void setEtat_compte(String etat_compte) {
		this.etat_compte = etat_compte;
	}
	public double getSolde_compte() {
		return solde_compte;
	}
	public void setSolde_compte(double solde_compte) {
		this.solde_compte = solde_compte;
	}
	public Date getDate_ouverture() {
		return date_ouverture;
	}
	public void setDate_ouverture(Date date_ouverture) {
		this.date_ouverture = date_ouverture;
	}
	public int getBn_client() {
		return bn_client;
	}
	public void setBn_client(int bn_client) {
		this.bn_client = bn_client;
	}
	
	
}
