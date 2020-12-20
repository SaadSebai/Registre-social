package com.master.registre.entity;

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
@Table(name = "citoyen")
public class Citoyen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int num_sec;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date date_naiss;
	@Column
	private String ville;
	@Column
	private String adresse;
	@Column
	private String emploi;
	
	public Citoyen() {
		
	}
	
	public Citoyen(int num_sec, String nom, String prenom, Date date_naiss, String ville, String adresse,
			String emploi) {
		this.num_sec = num_sec;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naiss = date_naiss;
		this.ville = ville;
		this.adresse = adresse;
		this.emploi = emploi;
	}

	public int getNum_sec() {
		return num_sec;
	}

	public void setNum_sec(int num_sec) {
		this.num_sec = num_sec;
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

	public Date getDate_naiss() {
		return date_naiss;
	}

	public void setDate_naiss(Date date_naiss) {
		this.date_naiss = date_naiss;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmploi() {
		return emploi;
	}

	public void setEmploi(String emploi) {
		this.emploi = emploi;
	}
	
	
}
