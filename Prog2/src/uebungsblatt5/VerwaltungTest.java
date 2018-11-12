package uebungsblatt5;
//Junit5
//Sina Haddadi Sedehi
//Matrikelnummer 566440

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VerwaltungTest {

	private Student student1;
	private Student student2;
	private Student student3;
	private Student student4;
	private Student student5;
	private Dozent dozent1;
	private Dozent dozent2;
	private Dozent dozent3;

	@BeforeEach
	void setUp() throws Exception {
		student1 = new Student("Sina", "Haddadi", 'm', 566440);
		student2 = new Student("Katrin", "Walter", 'w', 1234567);
		student3 = new Student("Homer", "Simpson", 'm', 6511915);
		student4 = new Student("Peter", "Adler", 'm', 32154654);
		student5 = new Student("David", "Decker", 'm', 6120215);
		
		dozent1 = new Dozent("Dominik", "Friedman", 'm', 1354);
		dozent2 = new Dozent("Nicole", "Ackerman", 'w', 2604);
		dozent3 = new Dozent("Christin", "Herzog", 'w', 3150);
	}

	@Test
	void testListeAnlegenCase1() {
		assertNotNull(Verwaltung.listeAnlegen(dozent1,dozent2,dozent3));
	}
	
	@Test
	void testListeAnlegenCase2() {
		//pruefe ob erstelltest array der liste entspricht
		Person[] x = new Person[3];
		x[0] = dozent1;
		x[1] = dozent2;
		x[2] = dozent3;
		assertArrayEquals(x, Verwaltung.listeAnlegen(dozent1,dozent2,dozent3));
	}
	
	@Test
	void testListeAnlegenCase3() {
		Verwaltung.listeAnlegen();
	}
	
	@Test
	void testListeAusgeben() {
		//gebe liste aus welches ein null element enthaelt
		Verwaltung.listeAusgeben(Verwaltung.listeAnlegen(dozent1,null,dozent3,student1));
	}
	
	@Test
	void testListeSortierensCase1() {
		//bereits sortiertes dozent array
		Person[] x = new Person[3];
		x[0] = dozent2;
		x[1] = dozent1;
		x[2] = dozent3;
		//prueft ob sortiertes array korrekt sortiert wurde
		assertArrayEquals(x, Verwaltung.listeSortieren(Verwaltung.listeAnlegen(dozent3,dozent2,dozent1)));
	}

	@Test
	void testZaehleWeiblichCase1() {
		assertEquals(1, Verwaltung.zaehleWeiblich(Verwaltung.listeAnlegen(student1,student2,student3,student4,student5)));
	}
	
	@Test
	void testZaehleWeiblichCase2() {
		assertEquals(2, Verwaltung.zaehleWeiblich(Verwaltung.listeAnlegen(dozent1,dozent2,dozent3)));
	}
	
	@Test
	void testZaehleWeiblichCase3() {
		assertEquals(0, Verwaltung.zaehleWeiblich(Verwaltung.listeAnlegen(dozent1,student1)));
	}
	
	@Test
	void testZaehleWeiblichCase4() {
		assertEquals(3, Verwaltung.zaehleWeiblich(Verwaltung.listeAnlegen(dozent2,dozent2,dozent2)));
	}
	
	@Test
	void testZaehleWeiblichCase5() {
		//soll Exception werfen
		assertThrows(NullPointerException.class,
				()-> { 
					//null als eingabe
					Verwaltung.zaehleWeiblich(Verwaltung.listeAnlegen(null,null));		
				});
	}
}
