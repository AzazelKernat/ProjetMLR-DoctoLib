package application;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.jpa.DaoAdresseJpa;
import dao.jpa.DaoCreneauxJpa;
import dao.jpa.DaoMotifJpa;
import dao.jpa.DaoPatientJpa;
import dao.jpa.DaoPraticienJpa;
import dao.jpa.DaoSpecialiteJpa;
import dao.jpa.DaoUtilisateurJpa;
import idao.IDaoAdresse;
import idao.IDaoCreneaux;
import idao.IDaoMotif;
import idao.IDaoPatient;
import idao.IDaoPraticien;
import idao.IDaoSpecialite;
import idao.IDaoUtilisateur;

public class Application {

	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetmlr");
	private final IDaoUtilisateur daoUtilisateur = new DaoUtilisateurJpa();
	private final IDaoAdresse daoAdresse = new DaoAdresseJpa();
	// private final IDaoPat daoMatiere = new DaoPatientJpa();
	private final IDaoMotif daoMotif = new DaoMotifJpa();
	private final IDaoCreneaux daoCreneaux = new DaoCreneauxJpa();
	private final IDaoPatient daoPatient = new DaoPatientJpa();
	private final IDaoPraticien daoPraticien = new DaoPraticienJpa();
	private final IDaoSpecialite daoSpecialite = new DaoSpecialiteJpa();

	private Application() {
	}

	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public IDaoUtilisateur getDaoUtilisateur() {
		return daoUtilisateur;
	}

	public IDaoAdresse getDaoAdresse() {
		return daoAdresse;
	}

	public IDaoMotif getDaoMotif() {
		return daoMotif;
	}

	public IDaoCreneaux getDaoCreneaux() {
		return daoCreneaux;
	}

	public IDaoPatient getDaoPatient() {
		return daoPatient;
	}

	public IDaoPraticien getDaoPraticien() {

		return daoPraticien;
	}

	public IDaoSpecialite getDaoSpecialite() {
		return daoSpecialite;
	}

}
