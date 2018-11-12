package übungsblatt2;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MeinArrayTest { 
	
//	@BeforeEach																hat zu problemen geführt
//	void setUp() throws Exception {
//		float[] a1 = {6f,5f,4f,3f,2f,1f};
//		float[] a2 = {6f,5f,4f,3f,2f,1f};
//		float[] a3 = {6f,5f,4f,8f,2f,5f};
//		float[] a4 = {6f,5f,4f,8f,2f};
//		float[] a5 = null;
//
//	}
	
	//Aufgabe a)
	//istGleich Best Case
	@Test
	void testIstGleichBestCase() {											//gleiche elemente, gleiche reihenfolge (identisch)
		float[] a1 = {6f,5f,4f,3f,2f,1f};
		float[] a2 = {6f,5f,4f,3f,2f,1f};
		assertTrue(MeinArray.istGleich(a1, a2));							//true erwartet
	}
	
	//istGleich Normallfall
	@Test
	void testIstGleichNormallfall() {										//ungleiche elemente, gleich laenge (nicht identisch)
		float[] a1 = {6f,5f,4f,3f,2f,1f};
		float[] a3 = {6f,5f,4f,8f,2f,5f};
		assertFalse(MeinArray.istGleich(a1, a3));							//false erwartet
	}
	
	//istGleich Worst Case1
	@Test
	void testIstGleichWorstCase1() {										//ungleiche laenge, gleiche reihenfolge (nicht identisch)
		float[] a3 = {6f,5f,4f,8f,2f,5f};
		float[] a4 = {6f,5f,4f,8f,2f};
		assertFalse(MeinArray.istGleich(a3, a4));							//false erwartet
	}
	
	
	//istGleich Worst Case2
	@Test
	void testIstGleichWorstCase2() {										//array = null = (nicht vergleichbar = nicht identisch)
		float[] a1 = {6f,5f,4f,3f,2f,1f};
		float[] a5 = null;
		try {
		assertFalse(MeinArray.istGleich(a1, a5));							//false erwartet
		}catch(NullPointerException e) {									//nullpointerexception fangen
			System.out.println("istGleich Worst Case2");
			System.out.println("a5 ist null also a1 ungleich a5");
		}
	}

	
	//Aufgabe b)
	//elementAmIndexUngleich Best Case
	@Test
	void testElementAmIndexUngleichBestCase() {								//gleiche laenge, erstes element anders
		float[] a1 = {6f,5f,4f,3f,2f,1f};
		float[] a2 = {7f,5f,4f,3f,2f,1f};
		assertEquals(0, MeinArray.elementAmIndexUngleich(a1, a2));			//Index 0 erwartet
	}
	
	//elementAmIndexUngleich Normallfall1
	@Test
	void testElementAmIndexUngleichNormallfall1() {							//a2 laenger als a1, gleiche elemente/reihenfolge
		float[] a1 = {6f,5f,4f};
		float[] a2 = {6f,5f,4f,3f,2f,1f,9f,3f};
		assertEquals(3, MeinArray.elementAmIndexUngleich(a1, a2));			//index 3 erwartet
		
	}
	
	//elementAmIndexUngleich Notmallfall2
	@Test
	void testElementAmIndexUngleichNormallfall2() {							//a1 laenger als a2, gleiche elemente/reihenfolge
		float[] a1 = {6f,5f,4f,3f,5f,9f};
		float[] a2 = {6f,5f};
		assertEquals(2, MeinArray.elementAmIndexUngleich(a1, a2));			//index 2 erwartet
	}
	
	//elementAmIndexUngleich Worst Case
	@Test
	void testElementAmIndexUngleichWorstCase() {							//array = null = (nicht vergleichbar)
		float[] a1 = {6f,5f,4f,3f,5f,9f};
		float[] a2 = null;
		try {
		assertEquals(-1, MeinArray.elementAmIndexUngleich(a1, a2));			//-1 erwartet
		}catch(NullPointerException e) {									//nullpointerexception fangen
			System.out.println("elementAmIndexUngleich Worst Case");
			System.out.println("array a2 ist null");
		}
	}
	
	
	//Aufgabe c)
	//einfuegenSortiert Best Case											
	@Test
	void testEinfuegenSortiertBestCase() {									//10L in ein vorher sortiertes array einfuegen
		long[] a = {5L,7L,11L,15L};
		System.out.println("einfuegenSortiert Best Case");
		MeinArray.einfuegenSortiert(a, 10L);								//5L 7L 10L 11L 15L erwartet
	}
	
	//einfuegenSortiert Normallfall
	@Test
	void testEinfuegenSortiertNormallfall() {								//10L in ein array einfuegen
		long[] a = {201L,7L,12L,16L};
		System.out.println("einfuegenSortiert Normallfall");
		MeinArray.einfuegenSortiert(a, 10L);								//7L 10L 12L 16L 201L erwartet
	}
	
	//einfuegenSortiert Worst Case1
	@Test
	void testEinfuegenSortiertWorstCase1() {								//10L in ein array mit ints und negativen zahlen einfuegen
		long[] a = {11,10,9,8,7,6,5,4,3,2,1,0,-1,-2,-3};
		System.out.println("einfuegenSortiert Worst Case1");
		MeinArray.einfuegenSortiert(a, 10L);								//-3L -2L -1L 0L 1L 2L 3L 4L 5L 6L 7L 8L 9L 10L 10L 11L erwartet
	}
	
	//einfuegenSortiert Worst Case3
	@Test
	void testEinfuegenSortiertWorstCase2() {								//10L in ein null array einfuegen
		long[] a = null;
		try {
			System.out.println("einfuegenSortiert");
		MeinArray.einfuegenSortiert(a, 10L);						
		}catch(NullPointerException e){										//nullpointerexception fangen
			System.out.println("long[] a ist null");
		}
	}


}
