package uebungsblatt6;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

import java.util.GregorianCalendar;

public class Warenlager {
	private double lagertemperatur;
	private final static int MAX_WARENTYPEN = 4;
	private final static int MAX_LAGERPLATZ = 800 * 4;
	private final static int MAX_LAGERPLATZ_PRO_TYP = 800;
	private int aktGelagert;
	private int verfuegbarerLagerplatz;
	private boolean ware0vorhanden = false;						//slot1		slot = warentyp
	private boolean ware1vorhanden = false;						//slot2
	private boolean ware2vorhanden = false;						//slot3
	private boolean ware3vorhanden = false;						//slot4
	private int[] wareAnzahl = new int[MAX_WARENTYPEN];			//array fuer anzahl der waren im jeweiligen slot
	Warensorte[] lagerwaren = new Warensorte[MAX_WARENTYPEN];	//array fuer waren im lager
	
	
	//parameterloser konstruktor
	public Warenlager() {	
		//init slots
		for(int i = 0; i < MAX_WARENTYPEN; i++) {
			lagerwaren[i] = new Warensorte("null", 0,"null");
		}
	}
	
	public Warenlager(double lagertemperatur) {
		this.lagertemperatur = lagertemperatur;
		//init slots
		for(int i = 0; i < MAX_WARENTYPEN; i++) {
			lagerwaren[i] = new Warensorte("null", 0,"null");
		}
	}
	
	//lagert ware ein
	public void einlagern(Warensorte x, int stueck) {
		boolean lagerplatzProTypNichtUeberschritten = true;
		
		//prueft ob noch platz ist im lager fuer den jeweiligen warentyp
		for(int j = 0; j < lagerwaren.length; j++) {
			//falls stueckzahl von x groesser ist als MAX_LAGERPLATZ_PRO_TYP
			if(lagerwaren[j].getTyp().equals(x.getTyp()) && (wareAnzahl[j] + stueck) > MAX_LAGERPLATZ_PRO_TYP) {
				lagerplatzProTypNichtUeberschritten = false;
			}
		}
		
		//wenn noch genug platz im lager und noch genug platz fuer den typ ist
		if ((aktGelagert + stueck) <= MAX_LAGERPLATZ && lagerplatzProTypNichtUeberschritten) {
			
			if (ware0vorhanden == false || lagerwaren[0].getTyp().equals(x.getTyp())) {				//wenn slot0 frei ist oder mit dem gleichem typ schon befuellt ist
				lagerwaren[0] = x;																	
				aktGelagert = aktGelagert + stueck;													
				wareAnzahl[0] = wareAnzahl[0] + stueck;
				setWare0vorhanden(true);
				System.out.println("Mit dem Einlagern wird begonnen");
				System.out.println(stueck +" " +x.getTyp() +" eingelagert");						
			} else if (ware1vorhanden == false || lagerwaren[1].getTyp().equals(x.getTyp())) {		//wenn slot1 frei ist oder mit dem gleichem typ schon befuellt ist
				lagerwaren[1] = x;
				aktGelagert = aktGelagert + stueck;
				wareAnzahl[1] = wareAnzahl[1] + stueck;
				setWare1vorhanden(true);
				System.out.println("Mit dem Einlagern wird begonnen");
				System.out.println(stueck +" " +x.getTyp() +" eingelagert");
			} else if (ware2vorhanden == false || lagerwaren[2].getTyp().equals(x.getTyp())) {		//wenn slot2 frei ist oder mit dem gleichem typ schon befuellt ist
				lagerwaren[2] = x;
				aktGelagert = aktGelagert + stueck;
				wareAnzahl[2] = wareAnzahl[2] + stueck;
				setWare2vorhanden(true);
				System.out.println("Mit dem Einlagern wird begonnen");
				System.out.println(stueck +" " +x.getTyp() +" eingelagert");
			} else if (ware3vorhanden == false || lagerwaren[3].getTyp().equals(x.getTyp())) {		//wenn slot3 frei ist oder mit dem gleichem typ schon befuellt ist
				lagerwaren[3] = x;
				aktGelagert = aktGelagert + stueck;
				wareAnzahl[3] = wareAnzahl[3] + stueck;
				setWare3vorhanden(true);
				System.out.println("Mit dem Einlagern wird begonnen");
				System.out.println(stueck +" " +x.getTyp() +" eingelagert");
			} else {
				//wenn keine lagerslots mehr frei sind
				System.out.println("Lager voll //" +x.getTyp() +" konnte nicht mehr eingelagert werden");
			} 
		}else {
			//wenn stueckzahl zu hoch bzw. wenn MAX_LAGERPLATZ uebersteigt wird
			System.out.println("Lager voll //" +x.getTyp() +" konnte nicht mehr eingelagert werden");
		}
	}
	
	//prueft ob bei einer temp die max_lagertemperatur ueberschritten ist 
	public void tempCheck(double temp) {
		int anz = 0;
		for(int i = 0; i < lagerwaren.length; i++) {
			//wenn produkt ein MilchProdukt ist (wichtig da es fuer Toilettenpapier nicht gilt)
			if (lagerwaren[i] instanceof MilchProdukt) {
				if (temp > ((MilchProdukt) lagerwaren[i]).getMax_lagertemperatur()) {
					anz = anz + 1;			//zaehlt anzahl von betroffenen produkten
					System.out.println("Max. Lagertemperatur fuer Milchprodukt " +lagerwaren[i].getName() +" ID " +i +" ist ueberschritten.");
				} 
			}
		}
		System.out.println("Bei Lagertemperatur " + temp + "°C ist die maximale Lagertemperatur fuer " + anz+ " Produktsorten ueberschritten.");
	}
	
	//prueft welche waren an einem bestimmten datum abgelaufen sein werden
	@SuppressWarnings("static-access")
	public void verfallsdatumCheck(GregorianCalendar datum) {
		int anz = 0;
		for(int i = 0; i < lagerwaren.length; i++) {
			//wenn produkt ein MilchProdukt ist (wichtig da Toilettenpapier kein verfallsdatum hat)
			if(lagerwaren[i] instanceof MilchProdukt) {
				if(((MilchProdukt)lagerwaren[i]).getVerfallsdatum().before(datum)){
					System.out.println("Milchprodukt " +lagerwaren[i].getName() +" ID " +i +", Anzahl " +wareAnzahl[i] +" ist abgelaufen.");
					anz = anz + 1;			//zaehlt anzahl von abgelaufenen produkten
				}
			}
		}
		System.out.println("Am " +datum.get(datum.DATE) +"." +(datum.get(datum.MONTH)+1) +"." +datum.get(datum.YEAR) +" laufen " +anz +" Produktsorten ab.");
	}
	
	//gibt gesamtbestand des lager aus
	public void printLager() {
		System.out.println("Der Gesamtbestand des Lagers ist");
		try {
			for(int i = 0; i < lagerwaren.length; i++) {
				System.out.println("ID: " +i +" Bezeichnung: " +lagerwaren[i].getName() +" Anzahl: " +wareAnzahl[i] +" Typ: " +lagerwaren[i].getTyp());
			}
		} catch (NullPointerException e) {
			System.err.println("Fehler in array");
		}
	}
	
	//getter und setter
	public double getLagertemperatur() {
		return lagertemperatur;
	}

	public static int getMaxWarentypen() {
		return MAX_WARENTYPEN;
	}

	public static int getMaxLagerplatz() {
		return MAX_LAGERPLATZ;
	}

	public static int getMaxLagerplatzProTyp() {
		return MAX_LAGERPLATZ_PRO_TYP;
	}

	public int getAktGelagert() {
		return aktGelagert;
	}

	public int getVerfuegbarerLagerplatz() {
		verfuegbarerLagerplatz = MAX_LAGERPLATZ - aktGelagert;
		return verfuegbarerLagerplatz;
	}

	public boolean isWare0vorhanden() {
		return ware0vorhanden;
	}

	public boolean isWare1vorhanden() {
		return ware1vorhanden;
	}

	public boolean isWare2vorhanden() {
		return ware2vorhanden;
	}

	public boolean isWare3vorhanden() {
		return ware3vorhanden;
	}

	public Warensorte[] getLagerwaren() {
		return lagerwaren;
	}

	public void setLagertemperatur(double lagertemperatur) {
		this.lagertemperatur = lagertemperatur;
	}

	public void setAktGelagert(int aktGelagert) {
		this.aktGelagert = aktGelagert;
	}

	public void setVerfuegbarerLagerplatz(int verfuegbarerLagerplatz) {
		this.verfuegbarerLagerplatz = verfuegbarerLagerplatz;
	}

	public void setWare0vorhanden(boolean ware0vorhanden) {
		this.ware0vorhanden = ware0vorhanden;
	}

	public void setWare1vorhanden(boolean ware1vorhanden) {
		this.ware1vorhanden = ware1vorhanden;
	}

	public void setWare2vorhanden(boolean ware2vorhanden) {
		this.ware2vorhanden = ware2vorhanden;
	}

	public void setWare3vorhanden(boolean ware3vorhanden) {
		this.ware3vorhanden = ware3vorhanden;
	}

	public void setLagerwaren(Warensorte[] lagerwaren) {
		this.lagerwaren = lagerwaren;
	}


}
