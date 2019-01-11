package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adresse_praticien")
public class AdressePraticien {
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "adresse_id")
	private Adresse adresse;

	@ManyToOne
	@JoinColumn(name = "praticien_id")
	private Praticien praticien;

	public AdressePraticien() {
		super();
	}

	public AdressePraticien(Adresse adresse, Praticien praticien) {
		super();
		this.adresse = adresse;
		this.praticien = praticien;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

}
