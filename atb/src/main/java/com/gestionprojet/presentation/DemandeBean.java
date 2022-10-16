package com.gestionprojet.presentation;

//import java.lang.Pow;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import com.gestionprojet.dao.entity.Agence;
import com.gestionprojet.dao.entity.Carte;
import com.gestionprojet.dao.entity.Demande;
import com.gestionprojet.service.AgenceService;
import com.gestionprojet.service.AngenceServiceImpl;
import com.gestionprojet.service.CarteService;
import com.gestionprojet.service.CarteServiceImpl;
import com.gestionprojet.service.DemandeService;
import com.gestionprojet.service.DemandeServiceImpl;

@ManagedBean(name="DemandeBean")
@RequestScoped
public class DemandeBean {
	private String nom;
	private int n_gsm;
	private String email;
	private Agence agence;
	private Date date_ajout;
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
	private List<SelectItem> agenceList;
	private List<Carte> cartelist;
	private AgenceService agenceservice = new  AngenceServiceImpl();
	private CarteService carteservice = new  CarteServiceImpl();
	private DemandeService demandeservice = new  DemandeServiceImpl();

	@PostConstruct	
	public void initBean() {
		List<Agence> list = agenceservice.findAll();
		for(Agence o:list) {
			agenceList.add(new SelectItem(o.getId_agence(),o.getNom_agence()));
		}
	}
	int pr_chif = 0;
	int dr_chif = 0;
	public String check;
	public  void saveDemande(ActionEvent e) {
		
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Correct", "Correct");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        cartelist = carteservice.findAll();
        for(Carte o:cartelist) {
        	pr_chif = (int) (o.getNum_carte() /Math.pow(10, 4));
        	dr_chif = (int) (o.getNum_carte() % Math.pow(10, 4));
        }
        if (pr_chif == quatre_prem_chiffre && quatre_der_chiffre == dr_chif) {
        	check = "ok";
        	 Demande d = new Demande();
             d.setAgence(agence);
             d.setCin(cin);
             d.setDate_ajout(new Date());
             d.setEmail(email);
             d.setSix_chiffre(six_chiffre);
             d.setNom(nom);
             d.setN_gsm(n_gsm);
             d.setQuatre_der_chiffre(quatre_der_chiffre);
             d.setQuatre_prem_chiffre(quatre_prem_chiffre);
             demandeservice.add(d);
        }else {
        	check = "it's not ok";
        }
       
        
        
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
	
}
