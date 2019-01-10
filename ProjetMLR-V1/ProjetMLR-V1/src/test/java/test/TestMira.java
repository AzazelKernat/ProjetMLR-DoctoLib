package test;

import application.Application;
import idao.IDaoAdresse;
import idao.IDaoUtilisateur;
import model.Adresse;
import model.TypeUtilisateur;
import model.Utilisateur;

public class TestMira {

	public static void main(String[] args) {
		
		//test utilisateur
		IDaoUtilisateur daoUtilisateur = Application.getInstance().getDaoUtilisateur();
		
		Utilisateur mira = new Utilisateur("miratoubassy@gmail.com", "miratou", TypeUtilisateur.Patient);
		
		mira = daoUtilisateur.save(mira);
		
		Utilisateur lea = new Utilisateur("leabayet@gmail.com", "leaba", TypeUtilisateur.Praticien);
		
		lea = daoUtilisateur.save(lea);
		
		//test adresse
		IDaoAdresse daoAdresse = Application.getInstance().getDaoAdresse();
		Adresse adr = new Adresse(12, "rue Rougemont", "75000", "Paris", "France");
		
		adr = daoAdresse.save(adr);
	
		
	}

}
