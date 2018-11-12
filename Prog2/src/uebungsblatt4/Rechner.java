package uebungsblatt4;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

public class Rechner {

	public Rechner(double zahl1, String operation, double zahl2) {
		
		if(operation.equals("add")) {														//wenn string operation = "add"
			System.out.println(zahl1 +" add " +zahl2 +" ist " +(zahl1+zahl2));
		}else if(operation.equals("sub")) {													//wenn string operation = "sub"
			System.out.println(zahl1 +" sub " +zahl2 +" ist " +(zahl1-zahl2));
		}else if(operation.equals("mul")) {													//wenn string operation = "mul"
			System.out.println(zahl1 +" mul " +zahl2 +" ist " +(zahl1*zahl2));
		}else if(operation.equals("div")) {													//wenn string operation = "div"
			System.out.println(zahl1 +" div " +zahl2 +" ist " +(zahl1/zahl2));
		}else {
			System.err.println("Error: Keine gueltige Operation!");							//wenn string operation keines der vorherigen entspricht
		}
	}
	
	
}