package application;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.jpa.DaoAdresseJpa;
import dao.jpa.DaoUtilisateurJpa;
import idao.IDaoAdresse;
import idao.IDaoUtilisateur;





public class Application {
	
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetmlr");
	private final IDaoUtilisateur daoUtilisateur = new DaoUtilisateurJpa();
	private final IDaoAdresse daoAdresse = new DaoAdresseJpa();
	
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
	
	
	
}
