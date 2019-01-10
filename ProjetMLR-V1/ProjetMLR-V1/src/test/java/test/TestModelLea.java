package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import application.Application;
import idao.IDaoPatient;
import idao.IDaoPraticien;
import idao.IDaoSpecialite;
import model.Patient;
import model.Praticien;
import model.Specialite;

public class TestModelLea {

	public static void main(String[] args) throws ParseException {
		// test1();
//		test2();
		test3();
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

		IDaoPraticien daoPatient = Application.getInstance().getDaoPraticien();

		Praticien Eric = new Praticien("Sultant", "Eric", sdf.parse("14/06/1968"), shf.parse("09:00"), "634856415",
				true, false, true);
		Eric = daoPatient.save(Eric);

		Praticien Emilie = new Praticien("Blunt", "Emilie", sdf.parse("05/07/179"), shf.parse("08:30"),"0154973265", "56456415",
				true, false, true);
		Emilie = daoPatient.save(Emilie);

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
