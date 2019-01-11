package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "specialite_praticien")
public class SpecialitePraticien {
	@Id
	@GeneratedValue
	private long id;

	@Version
	private int version;

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
