package uebungsblatt4_2;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

public class Azubi extends Mitarbeiter {
	private String bezeichnung;
	private int ausbildungsJahr;

	public Azubi(String vorname, String nachname, int gehalt, String bezeichnung, int ausbildungsJahr) {
		super(vorname, nachname, gehalt);
		this.bezeichnung = bezeichnung;
		this.ausbildungsJahr = ausbildungsJahr;
	}
	//getter bezeichnung
	public String getBezeichnung() {
		return bezeichnung;
	}
	//setter bezeichnung
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	//getter ausbildungsJahr
	public int getAusbildungsJahr() {
		return ausbildungsJahr;
	}
	//setter ausbildungsJahr
	public void setAusbildungsJahr(int ausbildungsJahr) {
		this.ausbildungsJahr = ausbildungsJahr;
	}
	
	//toString format: vorname nachname | gehalt€ bezeichnung | ausbildungsJahr
	public String toString() {
		return getVorname() +" " +getNachname() +" | " +getGehalt() +"€ "  +this.bezeichnung +" | " +"Jahr "+this.ausbildungsJahr;
		
	}

}
