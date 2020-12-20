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
@Table(name = "allocation_familiale")
public class AllocationFamiliale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id_af;
	@Column
	private float montant_all_fam;
	@Column
	private String raison;
	@Column
	private String periodique_f;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "num_sec")
	private Citoyen citoyen;
	
	public AllocationFamiliale() {
		
	}
	
	public AllocationFamiliale(int id_af, float montant_all_fam, String raison, String periodique_f) {
		this.id_af = id_af;
		this.montant_all_fam = montant_all_fam;
		this.raison = raison;
		this.periodique_f = periodique_f;
	}

	public int getId_af() {
		return id_af;
	}

	public void setId_af(int id_af) {
		this.id_af = id_af;
	}

	public float getMontant_all_fam() {
		return montant_all_fam;
	}

	public void setMontant_all_fam(float montant_all_fam) {
		this.montant_all_fam = montant_all_fam;
	}

	public String getRaison() {
		return raison;
	}

	public void setRaison(String raison) {
		this.raison = raison;
	}

	public String getPeriodique_f() {
		return periodique_f;
	}

	public void setPeriodique_f(String periodique_f) {
		this.periodique_f = periodique_f;
	}

	public Citoyen getCitoyen() {
		return citoyen;
	}

	public void setCitoyen(Citoyen citoyen) {
		this.citoyen = citoyen;
	}
	
	
}
