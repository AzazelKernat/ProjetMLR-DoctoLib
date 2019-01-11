package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import application.Application;
import idao.IDaoAdresse;
import idao.IDaoPatient;
import idao.IDaoPraticien;
import idao.IDaoUtilisateur;
import model.Adresse;
import model.Patient;
import model.Praticien;
import model.TypeUtilisateur;
import model.Utilisateur;

public class TestMira {

	public static void main(String[] args) throws ParseException {
		
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
	
		//test patient
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IDaoPatient daoPatient = Application.getInstance().getDaoPatient();

		Patient herve = new Patient("Prigent", "Herve", sdf.parse("14/06/1993"), true);
		herve = daoPatient.save(herve);
		
		Patient chene = new Patient("Dugland", "chene", sdf.parse("26/10/2002"), true);
		chene = daoPatient.save(chene);
		
		//test praticien
		SimpleDateFormat shf = new SimpleDateFormat("hh:mm");

		IDaoPraticien daoPraticien = Application.getInstance().getDaoPraticien();

		Praticien eric = new Praticien("Sultan", "Eric", sdf.parse("14/06/1968"), shf.parse("09:00"), "634856415",
				true, false, true);
		eric = daoPraticien.save(eric);

		Praticien emilie = new Praticien("Blunt", "Emilie", sdf.parse("05/07/179"), shf.parse("08:30"),"0154973265", "56456415",
				true, false, true);
		emilie = daoPraticien.save(emilie);
		
		//test lien utilisateur patient
		herve.setUtilisateur(lea);
		herve = daoPatient.save(herve);
		
		//test lien patient adresse
		chene.setAdresse(adr);
		chene = daoPatient.save(chene);
		
		//test lien utilisateur praticien
		eric.setUtilisateur(lea);
		eric = daoPraticien.save(eric);
		
		emilie.setUtilisateur(mira);
		emilie = daoPraticien.save(emilie);
		
	}

}
