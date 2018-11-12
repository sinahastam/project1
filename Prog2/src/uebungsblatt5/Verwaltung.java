package uebungsblatt5;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

public class Verwaltung {
	
	//parameterloser konstruktor
	public Verwaltung() {
		System.out.println("Warnung @Verwaltung");
	}
	
	//array aus personen erstellen und returnen
	public static Person[] listeAnlegen(Person ...x) {
		return x;
	}
	
	//liste von personen ausgeben
	public static void listeAusgeben(Person[] x) {
		//printet jedes element aus Person[] x
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	
	//sortiere personen liste nach nachname
	public static Person[] listeSortieren(Person[] x) {
		//erstellt temporaeres personen array
		Person[] temp = new Person[x.length];
		
		for(int i = 0; i < x.length; i++) {
			for(int a = 0; a < x.length-1; a++) {
				//vergleicht ersten character des nachnamens und tauscht diese ggf.
				if(x[a+1].getNachname().charAt(0) < x[a].getNachname().charAt(0)) {
					temp[0] = x[a+1];
					temp[1] = x[a];
					x[a+1] = temp[1];
					x[a] = temp[0];
				}
			}
		}
		//returnt sortiertes personen array
		return x;
	}
	
	//zaehlz anzahl weiblicher personen
	public static int zaehleWeiblich(Person[] x) {
		int anzahl = 0;
		for(int i = 0; i < x.length; i++) {
			//wenn geschlecht w dann zaehle eins hoch
			if(x[i].getGeschlecht() == 'w') {
				anzahl = anzahl + 1;
			}
		}
		//gebe anzahl wieder
		return anzahl;
	}
	
	
}

