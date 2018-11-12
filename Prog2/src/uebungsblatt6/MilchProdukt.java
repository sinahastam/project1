package uebungsblatt6;
//Sina Haddadi Sedehi
//Matrikelnummer 566440

import java.util.GregorianCalendar;

public class MilchProdukt extends Warensorte {
	private GregorianCalendar verfallsdatum;							//verfallsdatum fuer produkt
	private double max_lagertemperatur;									//maximal moegliche lagertemp fuer ware
	private boolean abgelaufen = false;
	private boolean max_lagertemp_ueberschritten = false;
	
	//parameterloser konstruktor
	public MilchProdukt() {
		System.out.println("Warnung @MilchProdukt");
	}

	public MilchProdukt(String name, double preis, String typ, GregorianCalendar verfallsdatum, double max_lagertemperatur) {
		super(name, preis, typ);
		this.verfallsdatum = verfallsdatum;
		this.max_lagertemperatur = max_lagertemperatur;
	}
	
	@SuppressWarnings("static-access")
	public void printVerfallsdatum() {
		//verfallsdatum von produkt ausgeben dd.mm.yyyy
		System.out.print(verfallsdatum.get(verfallsdatum.DATE) +".");
		System.out.print(verfallsdatum.get(verfallsdatum.MONTH)+1 +".");
		System.out.println(verfallsdatum.get(verfallsdatum.YEAR));
	}
	
	//string fuer toString ausgabe
	@SuppressWarnings("static-access")
	public String getVerfallsdatumString() {
		//erstellt string vom verfallsdatum im format dd.mm.yyyy
		String s;
		s = verfallsdatum.get(verfallsdatum.DATE) +".";
		s = s + (verfallsdatum.get(verfallsdatum.MONTH)+1) +".";
		s = s + verfallsdatum.get(verfallsdatum.YEAR);
		return s;
	}
	
	//getter und setter
	public GregorianCalendar getVerfallsdatum() {
		return verfallsdatum;
	}

	public double getMax_lagertemperatur() {
		return max_lagertemperatur;
	}

	public boolean isAbgelaufen() {
		return abgelaufen;
	}

	public boolean isMax_lagertemp_ueberschritten() {
		return max_lagertemp_ueberschritten;
	}

	public void setVerfallsdatum(GregorianCalendar verfallsdatum) {
		this.verfallsdatum = verfallsdatum;
	}

	public void setMax_lagertemperatur(double max_lagertemperatur) {
		this.max_lagertemperatur = max_lagertemperatur;
	}

	public void setAbgelaufen(boolean abgelaufen) {
		this.abgelaufen = abgelaufen;
	}

	public void setMax_lagertemp_ueberschritten(boolean max_lagertemp_ueberschritten) {
		this.max_lagertemp_ueberschritten = max_lagertemp_ueberschritten;
	}

	@Override
	public String toString() {
		return "MilchProdukt [max_lagertemperatur=" + max_lagertemperatur +"°C" + ", Verfallsdatum="
				+ getVerfallsdatumString() + ", toString()=" + super.toString() + "]";
	}

}
