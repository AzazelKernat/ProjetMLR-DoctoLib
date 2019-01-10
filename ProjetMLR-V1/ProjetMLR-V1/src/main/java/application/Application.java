package application;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import dao.jpa.DaoPatientJpa;



public class Application {
	
	private static Application instance = null;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("projetmlr");
//	private final IDaoPat daoMatiere = new DaoPatientJpa();
	
	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

}
