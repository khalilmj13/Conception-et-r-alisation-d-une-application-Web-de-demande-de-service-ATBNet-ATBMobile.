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
@Table(name="demande")
public class Demande {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id; 
	private String nom;
	private int n_gsm;
	private String email;
	private Agence agence;
	@Column(name = "date_ajout", nullable = false)
    @Temporal(TemporalType.DATE)
	private Date date_ajout;
	@Column(name = "date_trt", nullable = false)
    @Temporal(TemporalType.DATE)
	private Date date_trt;
	private String fig_trt;
	private boolean has_atbnet;
	private String atb_created;
	private boolean has_sms;
	private String mail_send;
	private int motif_rejet;
	private int cin;
	private double montant_ope;
	private int quatre_prem_chiffre;
	private int quatre_der_chiffre;
	private int six_chiffre;
	public Demande() {
		super();
	}
	public Demande(Long id, String nom, int n_gsm, String email, Agence agence, Date date_ajout, Date date_trt,
			String fig_trt, boolean has_atbnet, String atb_created, boolean has_sms, String mail_send, int motif_rejet,
			int cin, double montant_ope, int quatre_prem_chiffre, int quatre_der_chiffre, int six_chiffre) {
		super();
		this.id = id;
		this.nom = nom;
		this.n_gsm = n_gsm;
		this.email = email;
		this.agence = agence;
		this.date_ajout = date_ajout;
		this.date_trt = date_trt;
		this.fig_trt = fig_trt;
		this.has_atbnet = has_atbnet;
		this.atb_created = atb_created;
		this.has_sms = has_sms;
		this.mail_send = mail_send;
		this.motif_rejet = motif_rejet;
		this.cin = cin;
		this.montant_ope = montant_ope;
		this.quatre_prem_chiffre = quatre_prem_chiffre;
		this.quatre_der_chiffre = quatre_der_chiffre;
		this.six_chiffre = six_chiffre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getN_gsm() {
		return n_gsm;
	}
	public void setN_gsm(int n_gsm) {
		this.n_gsm = n_gsm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	public Date getDate_ajout() {
		return date_ajout;
	}
	public void setDate_ajout(Date date_ajout) {
		this.date_ajout = date_ajout;
	}
	public Date getDate_trt() {
		return date_trt;
	}
	public void setDate_trt(Date date_trt) {
		this.date_trt = date_trt;
	}
	public String getFig_trt() {
		return fig_trt;
	}
	public void setFig_trt(String fig_trt) {
		this.fig_trt = fig_trt;
	}
	public boolean isHas_atbnet() {
		return has_atbnet;
	}
	public void setHas_atbnet(boolean has_atbnet) {
		this.has_atbnet = has_atbnet;
	}
	public String getAtb_created() {
		return atb_created;
	}
	public void setAtb_created(String atb_created) {
		this.atb_created = atb_created;
	}
	public boolean isHas_sms() {
		return has_sms;
	}
	public void setHas_sms(boolean has_sms) {
		this.has_sms = has_sms;
	}
	public String getMail_send() {
		return mail_send;
	}
	public void setMail_send(String mail_send) {
		this.mail_send = mail_send;
	}
	public int getMotif_rejet() {
		return motif_rejet;
	}
	public void setMotif_rejet(int motif_rejet) {
		this.motif_rejet = motif_rejet;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public double getMontant_ope() {
		return montant_ope;
	}
	public void setMontant_ope(double montant_ope) {
		this.montant_ope = montant_ope;
	}
	public int getQuatre_prem_chiffre() {
		return quatre_prem_chiffre;
	}
	public void setQuatre_prem_chiffre(int quatre_prem_chiffre) {
		this.quatre_prem_chiffre = quatre_prem_chiffre;
	}
	public int getQuatre_der_chiffre() {
		return quatre_der_chiffre;
	}
	public void setQuatre_der_chiffre(int quatre_der_chiffre) {
		this.quatre_der_chiffre = quatre_der_chiffre;
	}
	public int getSix_chiffre() {
		return six_chiffre;
	}
	public void setSix_chiffre(int six_chiffre) {
		this.six_chiffre = six_chiffre;
	}
	@Override
	public String toString() {
		return "Demande [id=" + id + ", nom=" + nom + ", n_gsm=" + n_gsm + ", email=" + email + ", agence=" + agence
				+ ", date_ajout=" + date_ajout + ", date_trt=" + date_trt + ", fig_trt=" + fig_trt + ", has_atbnet="
				+ has_atbnet + ", atb_created=" + atb_created + ", has_sms=" + has_sms + ", mail_send=" + mail_send
				+ ", motif_rejet=" + motif_rejet + ", cin=" + cin + ", montant_ope=" + montant_ope
				+ ", quatre_prem_chiffre=" + quatre_prem_chiffre + ", quatre_der_chiffre=" + quatre_der_chiffre
				+ ", six_chiffre=" + six_chiffre + "]";
	}
	
	

}
