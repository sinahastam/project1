package uebungsblatt4_2;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

public class Test {

	public static void main(String[] args) {
		
		//Frank Walser
		Mitarbeiter frank = new Mitarbeiter("Frank", "Walser", 1600);
		System.out.println(frank);
		
		//Eva Flink
		Mitarbeiter eva = new Mitarbeiter("Eva", "Flink", 1650);
		System.out.println(eva);
		
		//Hans Boss
		Mitarbeiter hans = new Mitarbeiter("Hans", "Boss", 4000);
		System.out.println(hans);
		
		//Sven Vogel (Azubi)
		Azubi sven = new Azubi("Sven", "Vogel", 450, "Auszubildender", 1);
		System.out.println(sven);
		
		//erhoehung gehalt um 50€
		hans.gehaltErhoehung(50);
		System.out.println(hans);
		
		
		
		System.out.println("===============[Getter Tests]===============");
		
		//nachname frank
		System.out.println(frank.getNachname());
		//vorname eva
		System.out.println(eva.getVorname());
		//gehalt hans
		System.out.println(hans.getGehalt());
		//ausbildungsjahr sven
		System.out.println(sven.getAusbildungsJahr());
		//bezeichnung sven
		System.out.println(sven.getBezeichnung());
	}

}
