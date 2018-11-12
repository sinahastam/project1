package uebungsblatt6;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		
		//[initialisierungen]
		//kalender format GregorianCalendar(year, month, day) Monate gehen von 0-11 -> 0=Januar und 11=Dezember
		GregorianCalendar verfallsdatum1 = new GregorianCalendar(2018, 10, 29);			//29.11.2018 ist verfallsdatum1
		GregorianCalendar verfallsdatum2 = new GregorianCalendar(2019, 1, 24);			//24.02.2019 ist verfallsdatum2
		MilchProdukt m1 = new Milch(1.29, "Fettarme Milch", verfallsdatum1, 5.0);
		MilchProdukt m2 = new Milch(1.30, "Frischmilch", verfallsdatum2, 4.5);
		MilchProdukt k1 = new Kaese(3.49, "Gouda", verfallsdatum2, 9.5);
		MilchProdukt m3 = new Milch(0.99, "H-Milch", verfallsdatum1, 7.5);
		Toilettenpapier t1 = new Toilettenpapier(5.99, "Klopapier");
		
		System.out.println("=======================================================================================");
		
		//lager erstellen mit 0.5°C temperatur
		Warenlager lager = new Warenlager(0.5);
		System.out.println("//Lager kann " +Warenlager.getMaxWarentypen() +" verschiedene Warentypen und jeweils " +Warenlager.getMaxLagerplatzProTyp() +" Stueck eines Warentyps aufnehmen");
		
		System.out.println();
		
		//[einlagern von produkten]
		//300 Fettarme Milch
		lager.einlagern(m1, 300);
		//500 Firschmilch
		lager.einlagern(m2, 500);
		//100 Gouda
		lager.einlagern(k1, 100);
		//300 H-Milch
		lager.einlagern(m3, 300);
		//200 Fettarme Milch
		lager.einlagern(m1, 200);
		//50 Gouda
		lager.einlagern(k1, 50);
		//50 Toilettenpapier (wird nicht gelagert, da keine plaetze mehr frei)
		lager.einlagern(t1, 50);
		
		
		System.out.println();
		
		//gesamtbestand des lagers ausgeben
		lager.printLager();
		
		System.out.println();
		
		System.out.println("|=================================== [Verfallsdatum Check] ===================================|");
		//gibt aus welche produkte am 24.11.2018 ablaufen
		lager.verfallsdatumCheck(new GregorianCalendar(2018, 10, 24));
		
		System.out.println();
		
		System.out.println("|=================================== [Verfallsdatum Check] ===================================|");
		//gibt aus welche produkte am 30.1.2019 ablaufen
		lager.verfallsdatumCheck(new GregorianCalendar(2019, 0, 30));
		
		System.out.println();
		
		System.out.println("|=================================== [Temperatur Check] ===================================|");
		//gibt aus bei welchen produkten die max. lagertemperatur bei 7.1°C ueberschritten ist
		lager.tempCheck(7.1);
		
		System.out.println();
		
		//[toString Tests]
		System.out.println("|=================================== [toString Tests] ===================================|");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(k1);
		System.out.println(m3);
		System.out.println(t1);
		
		
		
	}

}
