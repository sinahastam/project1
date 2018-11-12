package uebungsblatt4;
//Run config -> Program Arguments: 13.4 add 7
//Sina Haddadi Sedehi
//Matrikelnummer 566440

public class RechnerTest {

	public static void main(String[] args) {
		
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);

		try {
			//erstelle berechne objekt mit (string->double, operation, string->double)
			Rechner berechne = new Rechner(Double.parseDouble(args[0]), args[1], Double.parseDouble(args[2]));
		} catch (NumberFormatException e) {
			//wenn eines der zahlen falsches format/datentyp besitzt
			System.err.println("Argumente fehlerhaft");
		}
		
		
		
	}

}
