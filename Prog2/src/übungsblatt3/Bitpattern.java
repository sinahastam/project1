package übungsblatt3;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

public class Bitpattern {

	public Bitpattern() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static int setBit(int number, int position) throws IllegalArgumentException{
		
		if(position > 31 || position < 0 || number < 0) {									//wenn position groesser 31 oder kleiner 0 oder number kleiner 0
			throw new IllegalArgumentException();											//dann werfe exception
		}
		
		int h = (int)Math.pow(2, position);													//Position in Zahl umwandeln 2 hoch position
		
		return number | h;																	//bitweises oder (produziert eine 1, sobald einer der Bits 1 ist)
	}
	
	public static int[] inBinary(int number) throws IllegalArgumentException{
		int[] inBinary = new int[31];														//inBinary laenge 31 setzten wegen int
//		int[] dInBinary = null;
//		int h = 0;
		if(number < 0) {																	//wenn number kleiner als 0
			throw new IllegalArgumentException();											//dann werfen exception
		}
		
		if(number == 0) {																	//wenn number == 0
			int[] inBinary0 = new int[1];													//erstelle array mit laenge 1
			inBinary0[0] = 0;																//0 in binaer ist 0
			return inBinary0;																//return array von number == 0
		}
		
		for(int i = 0; i<31; i++) {
			inBinary[i] = number % 2;														//number in binaer rechnen und jeden lauf in richte array stelle speichern
			number = number / 2;															
			System.out.print(inBinary[i]);													//gebe binary array in der console aus
		}
		
//		int binaryInZahl = 0;																//ab hier kommen einige versuche das array ohne fuehrende Nullen darzustellen
//		for(int i = 0; i<inBinary.length; i++) {	
//			if (inBinary[i] == 1) {
//				binaryInZahl = binaryInZahl + (int) Math.pow(2, i);
//			}
//		}
//		
//		for(int i = inBinary.length-1; i > 0; i--) {
//			if(inBinary[i] == 1) {
//				h = i;
//				dInBinary = new int[i];
//			}
//			dInBinary = new int[h];
//			for(int x = 0; x < dInBinary.length; x++) {
//				dInBinary[x] = inBinary[x];
//			}
//		}
//		
//		for(int i = 0; i < dInBinary.length; i++) {
//			System.out.print("\n" +dInBinary[i]);
//		}
//		
//		for(int i = 0; i < inBinary.length; i++) {
//			int lOld = inBinary.length;
//			if (inBinary[(inBinary.length-1) - i] == 0) {
//				int laenge = (inBinary.length-1) - i;
//				inBinary = new int[laenge];
//				
//			}
//		}	
//		
//		for(int x = inBinary.length-1; x == 0; x--) {
//			if(inBinary[x] == 1) {
//				int[] inBinaryOhneNullen = new int[x+1];
//				for(int i = 0; i < inBinaryOhneNullen.length; i++) {
//					int a = inBinary[i];
//					int b = inBinaryOhneNullen[i];
//					inBinaryOhneNullen[i] = a;
//					System.out.println(inBinaryOhneNullen[i]);
//				}
//			}
//		}		
//		System.out.println(Integer.toBinaryString(number));
		
		System.out.println();
		return inBinary;																		
	}
	
	//Aufgabe c)
	public static boolean endsOn(int number, String pattern) {
		String s = Integer.toBinaryString(number);												//erstelle ein binaeren string von number und speichere es in String s
		
		if(s.contains(pattern)) {																//wenn s den pattern enthaelt
			return true;
		}
		
		return false;
	}

}
