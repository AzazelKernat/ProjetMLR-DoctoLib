package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "specialite_praticien")
public class SpecialitePraticien {
	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	@JoinColumn(name = "specialite_id")
	private Specialite specialite;

	@ManyToOne
	@JoinColumn(name = "praticien_id")
	private Praticien praticienS;

	public SpecialitePraticien() {
		super();
	}

	public SpecialitePraticien(Specialite specialite, Praticien praticienS) {
		super();
		this.specialite = specialite;
		this.praticienS = praticienS;
	}

	public Specialite getSpecialite() {
		return specialite;
	}

	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}

	public Praticien getPraticienS() {
		return praticienS;
	}

	public void setPraticienS(Praticien praticienS) {
		this.praticienS = praticienS;
	}

	
}
