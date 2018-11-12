package übungsblatt1;
//Von Sina Haddadi Sedehi
//Matrikelnummer 566440

public class VektorTest {

	public static void main(String[] args) {
		Vektor v1 = new Vektor(2, 3);										//Konstruktion 2D
		Vektor v2 = new Vektor(1, 9);										//Konstruktion 2D
		Vektor v3 = new Vektor(9, 8, 7);									//Konstruktion 3D
		Vektor v4 = new Vektor(2, 1, 3);									//Konstruktion 3D
		
		System.out.println(Vektor.addiere2D(v1, v2));						//Addition 2D
		System.out.println(v2);												//ToString 2D Test
		System.out.println(v3);												//ToString 3D Test
		System.out.println(Vektor.addiere3D(v3, v4));						//Addition 3D
		System.out.println(Vektor.berechnneBetrag(v3));						//Betrag
		System.out.println(Vektor.berechneKreuzprodukt(v3, v4));			//Kreuzprodukt
	}

}
