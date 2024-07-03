import java.time.LocalDate;

public class Mitarbeiter {


	
	private int Gebjahr;
	private char Geschl;
	private String Vorname;
	private String Nachname;
	private int LNum;
	private String Adresse;
	private String Arbeiter;
	private LocalDate EintrittDate;
	private LocalDate AustrittDate;
	//Attribute
	
	
	public int getGebjahr() {
		return Gebjahr;
	}
	
	
	public void setGebjahr(int gebjahr) {
		Gebjahr = gebjahr;
	}
	
	
	public char getGeschl() {
		return Geschl;
	}
	public void setGeschl(char geschl) throws Exception {
	    if (Geschl != 'w' && Geschl != 'm' && Geschl != 'd') {
	        throw new Exception("Ungültiges Geschlecht.");
	    }
	    this.Geschl = Geschl;
	}
		
	
	
	
	public String getVorname() {
		return Vorname;
	}
	
	
	public void setVorname(String vorname) {
		Vorname = vorname;
	}
	
	
	public String getNachname() {
		return Nachname;
	}
	public void setNachname(String nachname) {
		Nachname = nachname;
	}
	
	
	public int getLNum() {
		return LNum;
	}
	public void setLNum(int lNum) {
		LNum = lNum;
	}
	
	
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	
	
	public String getArbeiter() {
		return Arbeiter;
	}
	public void setArbeiter(String arbeiter) {
		Arbeiter = arbeiter;
	}
	
	
	public LocalDate getEintrittDate() {
		return EintrittDate;
	}
	public void setEintrittDate(LocalDate eintrittDate) {
		EintrittDate = eintrittDate;
	}
	public LocalDate getAustrittDate() {
		return AustrittDate;
	}
	
	
	public void setAustrittDate(LocalDate austrittDate) {
		AustrittDate = austrittDate;
		
		//Getter und Setter
		
		
	}
	public Mitarbeiter(int gebjahr, char geschl, String vorname, String nachname, int lNum, String adresse,
			String arbeiter, LocalDate eintrittDate, LocalDate austrittDate) {
		super();
		Gebjahr = gebjahr;
		Geschl = geschl;
		Vorname = vorname;
		Nachname = nachname;
		LNum = lNum;
		Adresse = adresse;
		Arbeiter = arbeiter;
		EintrittDate = eintrittDate;
		AustrittDate = austrittDate; // Konstruktor, der mehrere Parameter annimmt ,  setzt die Werte der Attribute auf die Werte, die ihm übergeben wurden.
		
	

	
	
	
	
	
		
	
}
}
