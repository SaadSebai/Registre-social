package com.master.registre.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "system_de_retraite")
public class SystemRetraite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id_sys;
	@Column
	private float montant_re;
	@Column
	private float deduction_mensuelle;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "num_sec")
	private Citoyen citoyen;
	
	public SystemRetraite() {
		
	}
	
	public SystemRetraite(int id_sys, float montant_re, float deduction_mensuelle) {
		this.id_sys = id_sys;
		this.montant_re = montant_re;
		this.deduction_mensuelle = deduction_mensuelle;
	}

	public int getId_sys() {
		return id_sys;
	}

	public void setId_sys(int id_sys) {
		this.id_sys = id_sys;
	}

	public float getMontant_re() {
		return montant_re;
	}

	public void setMontant_re(float montant_re) {
		this.montant_re = montant_re;
	}

	public float getDeduction_mensuelle() {
		return deduction_mensuelle;
	}

	public void setDeduction_mensuelle(float deduction_mensuelle) {
		this.deduction_mensuelle = deduction_mensuelle;
	}

	public Citoyen getCitoyen() {
		return citoyen;
	}

	public void setCitoyen(Citoyen citoyen) {
		this.citoyen = citoyen;
	}
	
	
}
