package application;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.jpa.DaoAdresseJpa;
import dao.jpa.DaoUtilisateurJpa;
import idao.IDaoAdresse;
import idao.IDaoUtilisateur;
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
}
