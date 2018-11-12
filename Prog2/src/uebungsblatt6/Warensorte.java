package uebungsblatt6;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

public class Warensorte {
	private String name;
	private double preis;
	private String typ;
	private int anzahl;				//stueckzahl der ware fuer verwaltung
	
	//parameterloser konstruktor
	public Warensorte() {
		System.out.println("Warnung @Warensorte");
	}
	
	public Warensorte(String name, double preis,String typ) {
		this.name = name;
		this.preis = preis;
		this.typ = typ;
	}
	
	//getter und setter
	public String getName() {
		return name;
	}

	public double getPreis() {
		return preis;
	}

	public String getTyp() {
		return typ;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	
	@Override
	public String toString() {
		return "Warensorte [name=" + name + ", preis=" + preis +"€" + ", typ=" + typ + "]";
	}

}
