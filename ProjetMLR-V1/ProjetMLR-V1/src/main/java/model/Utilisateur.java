package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "mail")
	private String mail;

	@Column(name = "mot_de_passe")
	private String motDePasse;

	@Column(name = "type_utilisateur")
	@Enumerated(EnumType.STRING)
	private TypeUtilisateur typeUtilisateur;

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

}
