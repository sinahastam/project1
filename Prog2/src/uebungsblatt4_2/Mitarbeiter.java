package uebungsblatt4_2;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

public class Mitarbeiter {
	private String vorname;
	private String nachname;
	private int gehalt;

	public Mitarbeiter(String vorname, String nachname, int gehalt) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.gehalt = gehalt;
	}
	
	//getter vorname
	public String getVorname() {
		return vorname;
	}
	
	//setter vorname
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	//getter nachname
	public String getNachname() {
		return nachname;
	}
	
	//setter nachname
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	//getter gehalt
	public int getGehalt() {
		return gehalt;
	}

	//setter gehalt
	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}
	
	//erhöhung vom gehalt um absoluten betrag
	public int gehaltErhoehung(int betrag) {
		setGehalt(getGehalt() + betrag);						//getGehalt + betrag und sette ergebnis als neues gehalt
		return getGehalt();
	}
	
	//toString format: vorname nachname | gehalt€
	public String toString(){
		return this.vorname +" " +this.nachname +" | " +this.gehalt +"€";
	}

}
