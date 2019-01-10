package application;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.jpa.DaoCreneauxJpa;
import dao.jpa.DaoMotifJpa;
import idao.IDaoCreneaux;
import idao.IDaoMotif;

//import dao.jpa.DaoPatientJpa;



public class Application {
	
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetmlr");
//	private final IDaoPat daoMatiere = new DaoPatientJpa();
	private final IDaoMotif daoMotif = new DaoMotifJpa();
	private final IDaoCreneaux daoCreneaux = new DaoCreneauxJpa();
	
	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public IDaoMotif getDaoMotif() {
		return daoMotif;
	}

	public IDaoCreneaux getDaoCreneaux() {
		return daoCreneaux;
	}

	
}
