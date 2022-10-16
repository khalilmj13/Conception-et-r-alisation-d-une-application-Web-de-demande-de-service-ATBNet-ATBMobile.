package com.gestionprojet.dao.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;
//import org.hibernate.annotations.GenericGenerator;
//com.gestionprojet.dao.entity.Client
@Entity
@Table(name="client")
public class Client implements Serializable	{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//@GenericGenerator(name="gen",strategy="increment")
	
	//@Column(name = "id", unique = true, nullable = false, precision = 15, scale = 0)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String  nom ;
    private String  prenom;
    private String email;
    @Column(name = "date_n", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date_n;
    private int cin;
    private int bn_client;
    
    public Client() {
		super();
	}
	public Client(String nom, String prenom, String email, Date date_n, int cin, int bn_client) {
        super();
        this.nom = nom;
        this.prenom = prenom;	
        this.email = email;
        this.date_n = date_n;
        this.cin = cin;
        this.bn_client = bn_client;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDate_n() {
        return date_n;
    }
    public void setDate_n(Date date_n) {
        this.date_n = date_n;
    }
    public int getCin() {
        return cin;
    }
    public void setCin(int cin) {
        this.cin = cin;
    }
    public int getBn_client() {
        return bn_client;
    }
    public void setBn_client(int bn_client) {
        this.bn_client = bn_client;
    }
    @Override
    public String toString() {
        return "Client [nom=" + nom + ", prenom=" + prenom + ", id_client=" + ", email=" + email
                + ", date_n=" + date_n + ", cin=" + cin + ", bn_client=" + bn_client + "]";
    }

}
