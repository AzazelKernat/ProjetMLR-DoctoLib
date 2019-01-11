package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
	@Id
	@GeneratedValue
	private Integer id;

	@Version
	private int version;

	@Column(name = "mail")
	private String mail;

	@Column(name = "mot_de_passe")
	private String motDePasse;

	@Column(name = "type_utilisateur")
	@Enumerated(EnumType.STRING)
	private TypeUtilisateur typeUtilisateur;

	@OneToMany(mappedBy = "utilisateur")
	private List<Patient> patients = new ArrayList<>();

	@OneToOne(mappedBy = "utilisateur")
	private Praticien praticien;

	public Utilisateur() {
		super();
	}

	public Utilisateur(String mail, String motDePasse, TypeUtilisateur typeUtilisateur) {
		super();
		this.mail = mail;
		this.motDePasse = motDePasse;
		this.typeUtilisateur = typeUtilisateur;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public TypeUtilisateur getTypeUtilisateur() {
		return typeUtilisateur;
	}

	public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
