package model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "praticien")
public class Praticien {
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

	@Column(name = "ouverture")
	@Temporal(TemporalType.TIME)
	private Date ouverture;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "numOrdre")
	private String numOrdre;

	@Column(name = "cb")
	private boolean cb;

	@Column(name = "cheque")
	private boolean cheque;

	@Column(name = "especes")
	private boolean especes;

	public Praticien() {
		super();
	}

	public Praticien(String nom, String prenom, Date dtNaissance, Date ouverture, String telephone, String numOrdre,
			boolean cb, boolean cheque, boolean especes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dtNaissance = dtNaissance;
		this.ouverture = ouverture;
		this.telephone = telephone;
		this.numOrdre = numOrdre;
		this.cb = cb;
		this.cheque = cheque;
		this.especes = especes;
	}

	public Praticien(String nom, String prenom, Date dtNaissance, Date ouverture, String numOrdre, boolean cb,
			boolean cheque, boolean especes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dtNaissance = dtNaissance;
		this.ouverture = ouverture;
		this.numOrdre = numOrdre;
		this.cb = cb;
		this.cheque = cheque;
		this.especes = especes;
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

	public Date getOuverture() {
		return ouverture;
	}

	public void setOuverture(Date ouverture) {
		this.ouverture = ouverture;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getNumOrdre() {
		return numOrdre;
	}

	public void setNumOrdre(String numOrdre) {
		this.numOrdre = numOrdre;
	}

	public boolean isCb() {
		return cb;
	}

	public void setCb(boolean cb) {
		this.cb = cb;
	}

	public boolean isCheque() {
		return cheque;
	}

	public void setCheque(boolean cheque) {
		this.cheque = cheque;
	}

	public boolean isEspeces() {
		return especes;
	}

	public void setEspeces(boolean especes) {
		this.especes = especes;
	}

}
