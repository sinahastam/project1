package übungsblatt3;
//JUnit5
//Sina Haddadi Sedehi
//Matrikelnummer 566440

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BitpatternTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	//Aufgabe a)
	@Test
	void testSetBitCase1() {
		System.out.println(Bitpattern.setBit(10, 2));									//soll 14 liefern
		assertEquals(14, Bitpattern.setBit(10, 2));										//true
	}
	
	@Test
	void testSetBitCase2() {
		System.out.println(Bitpattern.setBit(7, 2));									//soll 7 liefern
		assertEquals(7, Bitpattern.setBit(7, 2));										//true
	}
	
	@Test
	void testSetBitCase3() {
		System.out.println(Bitpattern.setBit(0, 3));									//soll 8 liefern
		assertEquals(8, Bitpattern.setBit(0, 3));										//true
	}
	
	@Test
	void testSetBitCase4() {		
		assertThrows(IllegalArgumentException.class, 									//soll Exception werfen
			()-> { 
				System.out.println(Bitpattern.setBit(42, 37));							//da 37 groesser als 31 ist
			});
	}
	
	@Test
	void testSetBitCase5() {		
		assertThrows(IllegalArgumentException.class, 									//soll Exception werfen
			()-> { 
				System.out.println(Bitpattern.setBit(42, -5));							//da position negativ ist
			});
	}
	
	@Test
	void testSetBitCase6() {		
		assertThrows(IllegalArgumentException.class, 									//soll Exception werfen
			()-> { 
				System.out.println(Bitpattern.setBit(-10, 2));							//da -10 keine natuerliche zahl ist
			});
	}
	
	
	//Aufgabe b)
	@Test
	void testInBinaryCase1() {
		int[] test = new int[31];														//binaer array von 10 erstellen
		test[0] = 0;
		test[1] = 1;
		test[2] = 0;
		test[3] = 1;
		test[4] = 0;
		test[5] = 0;
		test[6] = 0;
		test[7] = 0;
		test[8] = 0;
		test[9] = 0;
		test[10] = 0;
		test[11] = 0;
		test[12] = 0;
		test[13] = 0;
		test[14] = 0;
		test[15] = 0;
		test[16] = 0;
		test[17] = 0;
		test[18] = 0;
		test[19] = 0;
		test[20] = 0;
		test[21] = 0;
		test[22] = 0;
		test[23] = 0;
		test[24] = 0;
		test[25] = 0;
		test[26] = 0;
		test[27] = 0;
		test[28] = 0;
		test[29] = 0;
		test[30] = 0;
		assertArrayEquals(test, Bitpattern.inBinary(10));								//test array ist gleich wie inBinary(10)
	}
	
	@Test
	void testInBinaryCase2() {
		int[] test = new int[1];														//erstelle array fuer 0 in binary array
		test[0] = 0;
		assertArrayEquals(test, Bitpattern.inBinary(0));								//test array ist gleich wie inBinary(0)
	}
	
	@Test
	void testInBinaryCase3() {		
		assertThrows(IllegalArgumentException.class, 									//soll Exception werfen
			()-> { 
				System.out.println(Bitpattern.inBinary(-12));							//da -12 keine natuerliche zahl ist
			});
	}
	
	
	//Aufgabe c)
	@Test
	void testEndsOnCase1() {
		assertTrue(Bitpattern.endsOn(7, "11"));											//endsOn(7,"11") liefert true zurueck
	}
	
	@Test
	void testEndsOnCase2() {
		assertTrue(Bitpattern.endsOn(10, "010"));										//endsOn(10, "010") liefert true zurueck
	}
	
	@Test
	void testEndsOnCase3() {
		assertFalse(Bitpattern.endsOn(10, "11"));										//endsOn(10, "11") liefert false zurueck
	}
	
	@Test
	void testEndsOnCase4() {
		assertFalse(Bitpattern.endsOn(10, "11001010"));									//endsOn(10, "11001010") liefert false zurueck
	}
	

}
