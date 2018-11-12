package übungsblatt2;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

public class MeinArray {

	public MeinArray() {
		// TODO Auto-generated constructor stub
	}
	
	//Aufgabe a
	public static boolean istGleich(float[] a1, float[] a2) {							//prüft ob identisch
		boolean h = false;																//hilfsvariable
		if((a1.length) != (a2.length) || a1 == null || a2 == null) {					//wenn länge verschieden oder null = return false 
			return false;																//ungleich
		}
		
		if(a1.length == a2.length) {													//wenn länge identisch
			for(int i = 0; i<a1.length;i++) {
				if(a1[i] == a2[i]) {													//falls element identisch = true = sind gleich
					h = true;
				}
				
				if(a1[i] != a2[i]) {													//falls element nicht identisch = false = sind ungleich
					h = false;
					break;
				}
			}
			
		}
		return h;																		
	}
	
	//Aufgabe b
	public static int elementAmIndexUngleich(float[]  a1, float[] a2) {					//liefert ersten index des langeren arrays ab dem punkt wo die elemente der arrays nicht mehr übereinstimmen
		int h = 0;																		//hilfsvariable
		if(a1.length>a2.length) {														//wenn array a1 laenger
			h = a1.length;
		}
		
		if(a2.length>a1.length) {														//wenn array a2 laenger
			h = a2.length;
		}
		
		if(a2.length == a1.length) {													//wenn laenge gleich von arrays
			h = a2.length;
		}
		
		
		for(int i = 0; i<h; i++) {														//schleife bis laenge von array welches langer ist
			if(i == a1.length || i == a2.length) {										//wenn grenze von array erreicht ist dann return index
				return i;
			}
			
			
			if(a2[i] != a1[i]) {														//wenn element an index i nicht identisch sind
				return i;																//gebe index zurück von der stelle wo nicht identisch
			}
		}
		
		return -1;																		//falls fehler bzw. nicht vergleichbar
	}
	
	//Aufgabe c
	public static void einfuegenSortiert(long[] a, long elem) {
		
		int m = a.length + 1;															//hilfsvariable
		
		//a sortieren
		for(int i = 0; i<a.length; i++) {												//a.lenght mal sortieren
			for(int t = 0; t<a.length - 1; t++) {										//alle elemente von a jeweils vergleichen und sortieren
				if(a[t+1] < a[t]) {
					long g = a[t+1];
					long k = a[t];
					a[t] = g;
					a[t+1] = k;
				}
			}
		}
		
		//a ausgeben auf console
		for(int x = 0; x<a.length; x++) {												
			System.out.print(a[x] +"L ");												//gebe sortieres array aus bevor elem eingefuegt wurde!
			
			if(x+1 == a.length) {
				System.out.println();
			}
		}
		
		//neues array erstellen
		long[] neu = new long[m];														//erstelle neues array welches eine laenger groeßer ist als a
		for(int y = 0; y<a.length; y++) {
			neu[y] = a[y];																//kopiere alle eben sortierte elemente aus a in neu
			neu[m-1] = elem;															//fuege an letzter stelle vom array elem ein
		}
		
		
		//neues array sortieren
		for(int i = 0; i<neu.length; i++) {												//neu.lenght mal sortieren
			for(int t = 0; t<neu.length - 1; t++) {										//alle elemente von neu jeweils vergleichen und sortieren
				if(neu[t+1] < neu[t]) {
					long g = neu[t+1];
					long k = neu[t];
					neu[t] = g;
					neu[t+1] = k;
				}
			}
		}
		
		//neues array ausgeben auf console
		for(int x = 0; x<neu.length; x++) {
			System.out.print(neu[x] +"L ");												//gebe sortiertes array aus nachdem elem eingefuegt wurde
			
			if(x+1 == neu.length) {
				System.out.println();
			}
		}
	}
	
}
