import java.time.LocalDate;

public class Manager extends Mitarbeiter{	
	
	
	
	private double gewinn; 
	private double LohnManager;
	private double ProvisionS;
	//Atttribute
	
	
public double getGewinn() {
		return gewinn;
	}





	public void setGewinn(double gewinn) throws Exception {
		if(gewinn <=0) {
			throw new Exception (" Gewinn kann nicht kleiner bzw. 0 Sein.");
		}
		this.gewinn = gewinn;
	}





	public double getLohnManager() {
		return LohnManager;
	}





	public void setLohnManager(double lohnManager) throws Exception {
		if(lohnManager <= 0) {
			throw new Exception ("Lohn kann nicht 0 bzw drunter liegen.");
		}
		LohnManager = lohnManager;
	}


	public double getProvisionS() {
		return ProvisionS;
	}



	public void setProvisionS(double provisionS) throws Exception {
		if (provisionS <=0) {
			throw new Exception ("Provision kann nicht 0 sein");			
		}
		ProvisionS = provisionS;						//Getter und Setter Methoden -  für jedes der Attribute, die es anderen Klassen ermöglichen, diese Werte zu lesen und zu ändern.
	}



	public double ProvisonKalk() {
		if (gewinn <0) {
			return 0;
		
		}
		double z = getGewinn();
		setGewinn(0);
		return z * ProvisionS; //berechnet die Provision für den Manager basierend auf dem Gewinn. Wenn der Gewinn negativ ist, gibt sie 0 zurück. Andernfalls wird  Gewinn auf 0 gesetzt und gibt das Ergebenus des Gewinns Mal des Provisionssatzes zurück.
	}


	
	public void LohnErh(double psatz) throws Exception {
	    if (psatz > 0 && psatz <= 10) {
	        LohnManager += LohnManager * (psatz / 100);
	    } else {
	        throw new Exception("Prozenzsatz muss größer 0 und kleiner 10 sein!");  // erhöht den Lohn des Managers um einen bestimmten Prozentsatz (psatz).Sollte psatz nicht angegeben bereich liegen wird eine Meldung an den Nutzer vermittelt.
	    }
	}
	
	
	
	



@Override
	public String toString() {
		return "Manager [gewinn=" + gewinn + ", LohnManager=" + LohnManager + ", ProvisionS=" + ProvisionS + "]"; //Um das String Objekt abrufen zu können.
	}





public Manager(int gebjahr, char geschl, String vorname, String nachname, int lNum, String adresse, String arbeiter,
			LocalDate eintrittDate, LocalDate austrittDate) {
		super(gebjahr, geschl, vorname, nachname, lNum, adresse, arbeiter, eintrittDate, austrittDate); // Der Konstruktor ruft den Konstruktor der Oberklasse (Mitarbeiter) mit den obigen Parametern dieser Klasse auf.
	
		
		
		
		
}


}
