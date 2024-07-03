import java.time.LocalDate;

public class Angestellte extends Mitarbeiter {
	
private double LohnStd;
private double LohnUStd;
private double StdAnzahl;
private double ÜberStd;
//Attribute


// Konstruktor, der mehrere Parameter annimmt:
public Angestellte(int gebjahr, char geschl, String vorname, String nachname, int lNum, String adresse,
			String arbeiter, LocalDate eintrittDate, LocalDate austrittDate) {
		super(gebjahr, geschl, vorname, nachname, lNum, adresse, arbeiter, eintrittDate, austrittDate); //Der Konstruktor ruft den Konstruktor der klasse (Mitarbeiter) mit diesen Parametern auf.**extends

	}



public double getLohnStd() {
	return LohnStd;
}



public void setLohnStd(double lohnStd) throws Exception {
	if (lohnStd <=0) {
		 throw new Exception("Fehler - Lohn kann nicht unter 0€ liegen.");
	}
	this.LohnStd=LohnStd;
	
}



public double getLohnUStd() {
	return LohnUStd;
}



public void setLohnUStd(double lohnUStd) throws Exception {
	if(lohnUStd <= 0) {
		throw new Exception("Es gibt keine Überstunden");
	}
	LohnUStd = lohnUStd;
}



public double getStdAnzahl() {
	return StdAnzahl;
}



public void setStdAnzahl(double stdAnzahl) throws Exception {
	if (stdAnzahl <=0) {
		throw new Exception("Stundenanzahl darf nicht 0 sein");
	}
	StdAnzahl = stdAnzahl;
}



public double getÜberStd() {
	return ÜberStd;
}



public void setÜberStd(double überStd) throws Exception {
	if(überStd <=0) {
		throw new Exception ("Die Überstunden können nicht 0 bzw. Kleiner 0 sein.");
	}
	ÜberStd = überStd; //Getter und Setter für jedes Attribut. Durch Getter und Setter wird es ermöglicht das andere Klassen diese Werte nutzen bzw. verändern können.
}



public void LohnErh() {
	LohnStd += LohnStd * 1;
	LohnUStd += LohnUStd *2; //erhöht den Stundenlohn und den Überstundenlohn um einen bestimmten Prozentsatz.
	
}
 

public double GehaltKalk () {
	return (LohnStd * StdAnzahl) + (LohnUStd + ÜberStd); //berechnet das Gesamtgehalt des Angestellten.
	
}

	
	
	
}
