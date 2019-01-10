package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "specialite")
public class Specialite {
	@Id
	@GeneratedValue
	private long id;

	@Column(name = "nom")
	private String nom;

	public Specialite() {
		super();
	}

	public Specialite(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
