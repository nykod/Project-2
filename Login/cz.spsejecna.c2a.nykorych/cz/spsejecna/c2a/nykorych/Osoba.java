package cz.spsejecna.c2a.nykorych;

public class Osoba {
	public String jmeno;
	public String prijmeni;
	public String email;
	public String pasw;
	public String email2;
	
	
	public Osoba(String jmeno, String prijmeni, String email, String pasw) {
		super();
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
		this.email = email;
		this.pasw = pasw;
	}

	public String getJmeno() {
		return jmeno;
	}

	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}

	public String getPrijmeni() {
		return prijmeni;
	}

	public void setPrijmeni(String prijmeni) {
		this.prijmeni = prijmeni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasw() {
		return pasw;
	}

	public void setPasw(String pasw) {
		this.pasw = pasw;
	}

	public Osoba(String email, String pasw) {
		super();
		this.email = email;
		this.pasw = pasw;
	}
	
	public String kontrolaEmailu(String email, String email2) {

		if (email2.matches(email))
			return "Email je spravne!";
		else
			return "Email neni spravny!";

	}
	
	@Override
	public String toString() {
		return "Vy: \r\nJmeno: " + jmeno + "\r\nPrijmeni: " + prijmeni + "\r\nEmail: "+email+"\r\nHeslo: "+pasw;
	}

}
