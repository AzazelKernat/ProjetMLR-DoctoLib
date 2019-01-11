package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import application.Application;
import idao.IDaoAdresse;
import idao.IDaoAdressePraticien;
import idao.IDaoPatient;
import idao.IDaoPraticien;
import idao.IDaoSpecialite;
import idao.IDaoSpecialitePraticien;
import model.Adresse;
import model.AdressePraticien;
import model.Patient;
import model.Praticien;
import model.Specialite;
import model.SpecialitePraticien;

public class TestModelLea {

	public static void main(String[] args) throws ParseException {
		 test1();
		 test2();
		// test3();
		test4();
		test5();
	}
	
	public static void test5() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat shf = new SimpleDateFormat("hh:mm");

		IDaoPraticien daoPraticien = Application.getInstance().getDaoPraticien();
		IDaoSpecialitePraticien daoSpecialitePraticien = Application.getInstance().getDaoSpecialitePraticien();
		IDaoSpecialite daoSpecialite = Application.getInstance().getDaoSpecialite();

//		List<SpecialitePraticien> listAd = new ArrayList<>();

		Specialite gynecologie = new Specialite("gynecologie");
		gynecologie = daoSpecialite.save(gynecologie);

		Specialite ophtalmo = new Specialite("ophtalmologue");
		ophtalmo = daoSpecialite.save(ophtalmo);

		Specialite proctologue = new Specialite("proctologue");
		proctologue = daoSpecialite.save(proctologue);

		Praticien fred = new Praticien("Al", "Fred", sdf.parse("24/02/1967"), shf.parse("09:00"), "6354856464",
				true, false, true);
		Praticien edmond = new Praticien("rostand", "edmond", sdf.parse("29/10/1978"), shf.parse("08:00"), "25453863", true,
				true, true);

	
		fred = daoPraticien.save(fred);
		edmond = daoPraticien.save(edmond);

		SpecialitePraticien spe1Prat1 = new SpecialitePraticien(gynecologie, fred);
		SpecialitePraticien spe2Prat1 = new SpecialitePraticien(ophtalmo, fred);
		SpecialitePraticien spe3Prat1 = new SpecialitePraticien(proctologue, fred);
		SpecialitePraticien spe1Prat2 = new SpecialitePraticien(gynecologie, edmond);
		SpecialitePraticien spe2Prat2 = new SpecialitePraticien(ophtalmo, edmond);

		spe1Prat1 = daoSpecialitePraticien.save(spe1Prat1);
		spe2Prat1 = daoSpecialitePraticien.save(spe2Prat1);
		spe3Prat1 = daoSpecialitePraticien.save(spe3Prat1);
		spe1Prat2 = daoSpecialitePraticien.save(spe1Prat2);
		spe2Prat2 = daoSpecialitePraticien.save(spe2Prat2);

//		listAd.add(spe1Prat1);
//		listAd.add(spe2Prat1);
//		listAd.add(spe3Prat1);
//		listAd.add(spe1Prat2);
//		listAd.add(spe2Prat2);
	}

	public static void test4() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat shf = new SimpleDateFormat("hh:mm");

		IDaoPraticien daoPraticien = Application.getInstance().getDaoPraticien();
		IDaoAdresse daoAdresse = Application.getInstance().getDaoAdresse();
		IDaoAdressePraticien daoAdressePraticien = Application.getInstance().getDaoAdressePraticien();

		List<AdressePraticien> listAd = new ArrayList<>();

		Adresse adr1 = new Adresse(12, "rue Rougemont", "75000", "Paris", "France");
		Adresse adr2 = new Adresse(15, "rue des archives", "75003", "Paris", "France");

		Praticien monica = new Praticien("Bellucci", "Monica", sdf.parse("25/05/1968"), shf.parse("10:00"), "341456451",
				false, false, true);
		Praticien eva = new Praticien("Green", "Eva", sdf.parse("12/12/1956"), shf.parse("08:30"), "56168786", false,
				false, true);

		adr1 = daoAdresse.save(adr1);
		adr2 = daoAdresse.save(adr2);
		monica = daoPraticien.save(monica);
		eva = daoPraticien.save(eva);

		AdressePraticien adr1Prat1 = new AdressePraticien(adr1, monica);
		AdressePraticien adr2Prat1 = new AdressePraticien(adr2, monica);
		AdressePraticien adr1Prat2 = new AdressePraticien(adr1, eva);
		AdressePraticien adr2Prat2 = new AdressePraticien(adr2, eva);

		adr1Prat1 = daoAdressePraticien.save(adr1Prat1);
		adr2Prat1 = daoAdressePraticien.save(adr2Prat1);
		adr1Prat2 = daoAdressePraticien.save(adr1Prat2);
		adr2Prat2 = daoAdressePraticien.save(adr2Prat2);

		listAd.add(adr1Prat1);
		listAd.add(adr2Prat1);
		listAd.add(adr1Prat2);
		listAd.add(adr2Prat2);

	}

	public static void test3() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat shf = new SimpleDateFormat("hh:mm");

		IDaoSpecialite daoSpecialite = Application.getInstance().getDaoSpecialite();

		Specialite gynecologie = new Specialite("gynecologie");
		gynecologie = daoSpecialite.save(gynecologie);

		Specialite ophtalmo = new Specialite("ophtalmologue");
		ophtalmo = daoSpecialite.save(ophtalmo);

		Specialite proctologue = new Specialite("proctologue");
		proctologue = daoSpecialite.save(proctologue);

	}

	public static void test2() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat shf = new SimpleDateFormat("hh:mm");

		IDaoPraticien daoPraticien = Application.getInstance().getDaoPraticien();

		Praticien Eric = new Praticien("Sultant", "Eric", sdf.parse("14/06/1968"), shf.parse("09:00"), "634856415",
				true, false, true);
		Eric = daoPraticien.save(Eric);

		Praticien Emilie = new Praticien("Blunt", "Emilie", sdf.parse("05/07/179"), shf.parse("08:30"), "0154973265",
				"56456415", true, false, true);
		Emilie = daoPraticien.save(Emilie);

	}

	public static void test1() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IDaoPatient daoPatient = Application.getInstance().getDaoPatient();

		Patient herve = new Patient("Prigent", "Herve", sdf.parse("14/06/1993"), true);
		herve = daoPatient.save(herve);

		Patient Chene = new Patient("Dugland", "chene", sdf.parse("26/10/2002"), true);
		Chene = daoPatient.save(Chene);

		Patient Jean = new Patient("Pelletier", "Jean", sdf.parse("26/10/1965"), false);
		Jean = daoPatient.save(Jean);

		Patient Francoise = new Patient("Duchamp", "Francoise", sdf.parse("14/06/1993"), false);
		Francoise = daoPatient.save(Francoise);

		Patient Nala = new Patient("Simba", "Nala", sdf.parse("14/06/1993"), "0154658413", false);
		Nala = daoPatient.save(Nala);

	}
}
