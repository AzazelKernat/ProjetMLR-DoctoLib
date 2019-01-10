package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creneaux")
public class Creneaux {

	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "date")
	private Date date;
	@Column(name = "dureeCreneau")
	private Integer dureeCreneau;
//	@Column(name = "adresse")
//	@Embedded
//	private Adresse lieuConsult;

	public Creneaux() {
		super();
	}

	public Creneaux(Date date, Integer dureeCreneau) {
		super();
		this.date = date;
		this.dureeCreneau = dureeCreneau;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getDureeCreneau() {
		return dureeCreneau;
	}

	public void setDureeCreneau(Integer dureeCreneau) {
		this.dureeCreneau = dureeCreneau;
	}

//	public Adresse getLieuConsult() {
//		return lieuConsult;
//	}
//
//	public void setLieuConsult(Adresse lieuConsult) {
//		this.lieuConsult = lieuConsult;
//	}

}
