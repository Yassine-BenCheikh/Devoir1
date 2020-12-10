package com.example.Atelier01.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voiture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idvoiture;
	private String nomVoiture;
	private Double prixVoiture;
	private Date dateCreation;
	
	public Voiture() {
		super();		
	}
	
	public Voiture(String nomVoiture, Double prixVoiture, Date dateCreation) {
		super();
		this.nomVoiture = nomVoiture;
		this.prixVoiture = prixVoiture;
		this.dateCreation = dateCreation;
	}

	public long getIdvoiture() {
		return idvoiture;
	}
	public void setIdvoiture(long idvoiture) {
		this.idvoiture = idvoiture;
	}
	public String getNomVoiture() {
		return nomVoiture;
	}
	public void setNomVoiture(String nomVoiture) {
		this.nomVoiture = nomVoiture;
	}
	public Double getPrixVoiture() {
		return prixVoiture;
	}
	public void setPrixVoiture(Double prixVoiture) {
		this.prixVoiture = prixVoiture;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Voiture [idvoiture=" + idvoiture + ", nomVoiture=" + nomVoiture + ", prixVoiture=" + prixVoiture
				+ ", dateCreation=" + dateCreation + "]";
	}
	

}
