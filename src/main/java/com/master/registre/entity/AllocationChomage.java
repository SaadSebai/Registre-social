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
@Table(name = "allocation_de_chomage")
public class AllocationChomage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id_ac;
	@Column
	private float montant_all_ch;
	@Column
	private String periodique_ch;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "num_sec")
	private Citoyen citoyen;
	
	public AllocationChomage() {
		
	}
	
	public AllocationChomage(int id_ac, float montant_all_ch, String periodique_ch, Citoyen citoyen) {
		this.id_ac = id_ac;
		this.montant_all_ch = montant_all_ch;
		this.periodique_ch = periodique_ch;
		this.citoyen = citoyen;
	}

	public int getId_ac() {
		return id_ac;
	}

	public void setId_ac(int id_ac) {
		this.id_ac = id_ac;
	}

	public float getMontant_all_ch() {
		return montant_all_ch;
	}

	public void setMontant_all_ch(float montant_all_ch) {
		this.montant_all_ch = montant_all_ch;
	}

	public String getPeriodique_ch() {
		return periodique_ch;
	}

	public void setPeriodique_ch(String periodique_ch) {
		this.periodique_ch = periodique_ch;
	}

	public Citoyen getCitoyen() {
		return citoyen;
	}

	public void setCitoyen(Citoyen citoyen) {
		this.citoyen = citoyen;
	}
	
	
}
