package übungsblatt1;
//Von Sina Haddadi Sedehi
//Matrikelnummer 566440

public class Vektor {
	private double x,y,z;
		
	public Vektor(double x, double y) {										//Konstruktor 2D
		this.x = x;
		this.y = y;
	}
	
	public Vektor(double x, double y, double z) {							//Konstruktor 3D
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static Vektor addiere2D(Vektor v1, Vektor v2) {						//Addition 2D
		if(v1 == null || v2 == null) throw new
		IllegalArgumentException ("Argumente können nicht null sein");
		
		Vektor erg = new Vektor(v1.x + v2.x, v1.y + v2.y);
		return erg;
	}
	
	public static Vektor addiere3D(Vektor v1, Vektor v2) {						//Addition 3D
		if(v1 == null || v2 == null) throw new
		IllegalArgumentException ("Argumente können nicht null sein");
		
		
		Vektor erg = new Vektor(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
		return erg;
	}
	
	public static double berechnneBetrag(Vektor v1) {							//Betrag von Vektor
		if(v1 == null) throw new
		IllegalArgumentException ("Argumente können nicht null sein");
		
		
		return Math.sqrt(v1.x*v1.x + v1.y*v1.y + v1.z*v1.z);
	}
	
	public static Vektor berechneKreuzprodukt(Vektor v1, Vektor v2) {			//Kreuzprodukt von 3D Vektoren
		if(v1 == null || v2 == null) throw new
		IllegalArgumentException ("Argumente können nicht null sein");
		
		
		Vektor erg = new Vektor(v1.y*v2.z - v1.z*v2.y, v1.z*v2.x - v1.x*v2.z, v1.x*v2.y - v1.y*v2.x);
		return erg;
	}
	
	public String toString() {												
		if(this.z == 0) {													
			return "(" +this.x +", " +this.y +")";							//Ausgabe 2D (x, y)
		}
		return "(" +this.x +", " +this.y +", " +this.z +")";				//Ausgabe 3D (x, y, z)
		
	}
	
	
	
}
