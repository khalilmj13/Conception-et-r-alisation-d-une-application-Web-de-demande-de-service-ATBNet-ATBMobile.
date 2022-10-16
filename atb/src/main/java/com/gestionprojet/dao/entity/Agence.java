package com.gestionprojet.dao.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
//com.gestionprojet.dao.entity.Agence
@Entity
@Table(name="agence")
public class Agence  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	@Column(name = "id", unique = true, nullable = false, precision = 15, scale = 0)
	@Id
	private Long id_agence;
    private String nom_agence;
    
    public Agence() {
		super();
	}
	public Agence(long id_agence, String nom_agence) {
        super();
        this.id_agence = id_agence;
        this.nom_agence = nom_agence;
    }
    public long getId_agence() {
        return id_agence;
    }
    public void setId_agence(long id_agence) {
        this.id_agence = id_agence;
    }
    public String getNom_agence() {
        return nom_agence;
    }
    public void setNom_agence(String nom_agence) {
        this.nom_agence = nom_agence;
    }
    @Override
    public String toString() {
        return "Agence [id_agence=" + id_agence + ", nom_agence=" + nom_agence + "]";
    }


}
