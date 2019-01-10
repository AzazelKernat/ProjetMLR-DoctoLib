package model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient {
	@Id
	@GeneratedValue
	private long id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	@Column(name = "dtNais")
	@Temporal(TemporalType.DATE)
	private Date dtNaissance;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "principale")
	private boolean principale;

	public Patient() {
		super();
	}

	public Patient(String nom, String prenom, Date dtNaissance, boolean principale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dtNaissance = dtNaissance;
		this.principale = principale;
	}

	public Patient(String nom, String prenom, Date dtNaissance, String telephone, boolean principale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dtNaissance = dtNaissance;
		this.telephone = telephone;
		this.principale = principale;
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

	public Date getDtNaissance() {
		return dtNaissance;
	}

	public void setDtNaissance(Date dtNaissance) {
		this.dtNaissance = dtNaissance;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public boolean isPrincipale() {
		return principale;
	}

	public void setPrincipale(boolean principale) {
		this.principale = principale;
	}

}
