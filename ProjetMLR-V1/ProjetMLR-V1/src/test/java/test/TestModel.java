package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import application.Application;
import model.Creneaux;
import model.Motif;

public class TestModel {

	public static void main(String[] args) throws ParseException {
		testRdzVs();
	}

	static void testRdzVs() throws ParseException {
		Application app = Application.getInstance();
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/YYYY");

		Motif chir = new Motif("Chirurgie", 80, 4);
		Motif rhu = new Motif("Rhume", 40, 2);
		Motif gas = new Motif("Gastro", 50, 2);

		app.getDaoMotif().save(chir);
		app.getDaoMotif().save(rhu);
		app.getDaoMotif().save(gas);
		
		Creneaux c1=new Creneaux(date.parse("12/10/2015"), 4);
		Creneaux c2=new Creneaux(date.parse("13/10/2015"), 8);
		Creneaux c3=new Creneaux(date.parse("14/10/2015"), 6);
		Creneaux c4=new Creneaux(date.parse("15/10/2015"), 2);
		
		app.getDaoCreneaux().save(c1);
		app.getDaoCreneaux().save(c2);
		app.getDaoCreneaux().save(c3);
		app.getDaoCreneaux().save(c4);

		app.getEmf().close();

	}
}
