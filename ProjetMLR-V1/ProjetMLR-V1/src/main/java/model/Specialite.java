package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "specialite")
public class Specialite {
	@Id
	@GeneratedValue
	private long id;

	@Column(name = "nom")
	private String nom;

	@OneToMany(mappedBy = "specialite")
	private List<SpecialitePraticien> praticiens = new ArrayList<>();

	public Specialite() {
		super();
	}

	public List<SpecialitePraticien> getPraticiens() {
		return praticiens;
	}

	public void setPraticiens(List<SpecialitePraticien> praticiens) {
		this.praticiens = praticiens;
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
