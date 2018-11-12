package uebungsblatt5;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

public class Test {

	public static void main(String[] args) {
		
		//Studenten
		Student student1 = new Student("Sina", "Haddadi", 'm', 566440);
		Student student2 = new Student("Katrin", "Walter", 'w', 1234567);
		Student student3 = new Student("Homer", "Simpson", 'm', 6511915);
		Student student4 = new Student("Peter", "Adler", 'm', 32154654);
		Student student5 = new Student("David", "Decker", 'm', 6120215);
		
		//Dozenten
		Dozent dozent1 = new Dozent("Dominik", "Friedman", 'm', 1354);
		Dozent dozent2 = new Dozent("Nicole", "Ackerman", 'w', 2604);
		Dozent dozent3 = new Dozent("Christin", "Herzog", 'w', 3150);
		
		//Aufgabe i liste ausgeben
		Verwaltung.listeAusgeben(Verwaltung.listeAnlegen(student1,student2,student3,student4,student5));
		
		System.out.println("=====================================================================================================");
		//Aufgabe i sortierte ausgabe
		Verwaltung.listeAusgeben(Verwaltung.listeSortieren(Verwaltung.listeAnlegen(student1,student2,student3,student4,student5)));
		
		System.out.println("=====================================================================================================");
		//Aufgabe i anzahl weiblich
		System.out.println("Anzahl Weiblich: " +Verwaltung.zaehleWeiblich(Verwaltung.listeAnlegen(student1,student2,student3,student4,student5)));
		
		
		System.out.println("=====================================================================================================");
		//Aufgabe ii
		Verwaltung.listeAusgeben(Verwaltung.listeAnlegen(dozent1,dozent2,dozent3));
		
		System.out.println("=====================================================================================================");
		//Aufgabe ii sortierte ausgabe
		Verwaltung.listeAusgeben(Verwaltung.listeSortieren(Verwaltung.listeAnlegen(dozent1,dozent2,dozent3)));
		
		System.out.println("=====================================================================================================");
		//Aufgabe ii anzahl weiblich
		System.out.println("Anzahl Weiblich: " +Verwaltung.zaehleWeiblich(Verwaltung.listeAnlegen(dozent1,dozent2,dozent3)));
		
		
	}
	

}
