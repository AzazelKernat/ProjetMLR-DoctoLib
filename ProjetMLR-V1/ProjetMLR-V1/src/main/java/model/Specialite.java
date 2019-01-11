package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "specialite")
public class Specialite {
	@Id
	@GeneratedValue
	private long id;

	@Version
	private int version;

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
