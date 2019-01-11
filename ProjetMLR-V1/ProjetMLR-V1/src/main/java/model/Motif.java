package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Motif")
public class Motif {

	@Id
	@GeneratedValue
	private Long id;

	@Version
	private int version;

	@Column(name = "motif")
	private String motif;

	@Column(name = "prix")
	private Integer prix;

	@Column(name = "duree")
	private Integer duree;

	public Motif() {
		super();
	}

	public Motif(String motif, Integer prix, Integer duree) {
		super();
		this.motif = motif;
		this.prix = prix;
		this.duree = duree;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	public Integer getDuree() {
		return duree;
	}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
}
