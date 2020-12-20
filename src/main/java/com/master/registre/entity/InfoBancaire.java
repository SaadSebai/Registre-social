package com.master.registre.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "info_bancaire")
public class InfoBancaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int num_compte;
	@Column
	private float sold;
	@Temporal(TemporalType.DATE)
	private Date date_creation;
	@Column
	private String nom_banque;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "num_sec")
	private Citoyen citoyen;
	
	public InfoBancaire() {
		
	}
	
	public InfoBancaire(int num_compte, float sold, Date date_creation, String nom_banque) {
		this.num_compte = num_compte;
		this.sold = sold;
		this.date_creation = date_creation;
		this.nom_banque = nom_banque;
	}

	public int getNum_compte() {
		return num_compte;
	}

	public void setNum_compte(int num_compte) {
		this.num_compte = num_compte;
	}

	public float getSold() {
		return sold;
	}

	public void setSold(float sold) {
		this.sold = sold;
	}

	public Date getDate_creation() {
		return date_creation;
	}

	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}

	public String getNom_banque() {
		return nom_banque;
	}

	public void setNom_banque(String nom_banque) {
		this.nom_banque = nom_banque;
	}

	public Citoyen getCitoyen() {
		return citoyen;
	}

	public void setCitoyen(Citoyen citoyen) {
		this.citoyen = citoyen;
	}
	
	
}
