package com.gestionprojet.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="carte")
public class Carte {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id; 
 private int num_carte ;
 private String etat_carte;
public Carte() {
	super();
}
public Carte(Long id, int num_carte, String etat_carte) {
	super();
	
	this.id = id;
	this.num_carte = num_carte;
	this.etat_carte = etat_carte;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public int getNum_carte() {
	return num_carte;
}
public void setNum_carte(int num_carte) {
	this.num_carte = num_carte;
}
public String getEtat_carte() {
	return etat_carte;
}
public void setEtat_carte(String etat_carte) {
	this.etat_carte = etat_carte;
}
 
 	
}
