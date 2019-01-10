package application;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.jpa.DaoPatientJpa;
import dao.jpa.DaoPraticienJpa;
import dao.jpa.DaoSpecialiteJpa;
import idao.IDaoPatient;
import idao.IDaoPraticien;
import idao.IDaoSpecialite;
import dao.jpa.DaoCreneauxJpa;
import dao.jpa.DaoMotifJpa;
import idao.IDaoCreneaux;
import idao.IDaoMotif;

public class Application {

	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetmlr");
	private final IDaoUtilisateur daoUtilisateur = new DaoUtilisateurJpa();
	private final IDaoAdresse daoAdresse = new DaoAdresseJpa();
//	private final IDaoPat daoMatiere = new DaoPatientJpa();
	private final IDaoMotif daoMotif = new DaoMotifJpa();
	private final IDaoCreneaux daoCreneaux = new DaoCreneauxJpa();
	private final IDaoPatient daoPatient = new DaoPatientJpa();
	private final IDaoPraticien daoPraticien= new DaoPraticienJpa();
	private final IDaoSpecialite daoSpecialite= new DaoSpecialiteJpa();

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

		return daoMotif;
	public IDaoMotif getDaoMotif() {
	}

		return daoCreneaux;
	public IDaoCreneaux getDaoCreneaux() {
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
