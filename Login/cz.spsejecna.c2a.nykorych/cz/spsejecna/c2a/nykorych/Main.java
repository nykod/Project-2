package cz.spsejecna.c2a.nykorych;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		HashMap<Integer, Osoba> PohlM = new HashMap<Integer, Osoba>();
		HashMap<Integer, HashMap> PohlZ = new HashMap<Integer, HashMap>();
		String jmeno = "";
		String prijmeni = "";
		Osoba OBezJmena = new Osoba(null, null);
		Osoba OJm = new Osoba(jmeno, prijmeni, null, null);
		
		Scanner sc = new Scanner(System.in);
		String VyberP = "";
		
		
		System.out.println("Vitejte! Vyberte si pohlavi:");
		System.out.println("1 ... Muž");
		System.out.println("2 ... Žena");
		VyberP = sc.nextLine();
		while (!VyberP.matches("[(1|2)]")) {
			System.out.println("Spatny vyber! Vyberte si pohlavi:");
			System.out.println("1 ... Muž");
			System.out.println("2 ... Žena");
			VyberP = sc.nextLine();
		}
		
		if (VyberP.equals("1")) {
			String email = null;
			Scanner st = new Scanner(System.in);
			Regex r = new Regex();
			
			System.out.println("Chces zadat svoje jmeno a prijmeni?");
			System.out.println("1 ... Ano");
			System.out.println("2 ... Ne");
			String Vybern1 = sc.nextLine();
			
			if(Vybern1.matches("[(1|Ano)]")) {
				System.out.println("Zadejte svoje jmeno:");
				Scanner jmenoM = new Scanner(System.in);
				jmeno = jmenoM.nextLine();
				OJm.setJmeno(jmeno);
				
				System.out.println("Zadejte svoje prijmeni: ");
				Scanner prijmeniM = new Scanner(System.in);
				prijmeni = prijmeniM.nextLine();
				OJm.setPrijmeni(prijmeni);
				
				System.out.println("Zadali jste to spravne? Jestli ne tak to muzete prepsat.");
				System.out.println(OJm.getJmeno());
				System.out.println(OJm.getPrijmeni());
				
				System.out.println("1 ... Ano");
				System.out.println("2 ... Ne");
				
				Scanner sp = new Scanner(System.in);
				String sprav = sp.nextLine();
				
				while(!sprav.matches("[(1|Ano)]")) {
					System.out.println("Zadejte svoje jmeno:");
					jmenoM = new Scanner(System.in);
					jmeno = jmenoM.nextLine();
					OJm.setJmeno(jmeno);
					
					System.out.println("Zadejte svoje prijmeni: ");
					prijmeniM = new Scanner(System.in);
					prijmeni = prijmeniM.nextLine();
					OJm.setPrijmeni(prijmeni);
					System.out.println("Zadali jste to spravne? Jestli ne tak to muzete prepsat.");
					
					System.out.println(OJm.getJmeno());
					System.out.println(OJm.getPrijmeni());
					
					System.out.println("1 ... Ano");
					System.out.println("2 ... Ne");

					sprav = sp.nextLine();
				}
			}
			
			
			System.out.println("Muzou se zadavat jenom ceske(.cz) nebo mezinarodni(.com) emaily.");
			System.out.println("Zadejte svuj email: ");
			email = st.nextLine();
			while (!email.matches("[a-zA-z0-9]+[@][a-z]+[.](cz|com)")) {
				System.out.println("Spatny email! Prosim zadejte jeste jednou: ");
				System.out.println("Zadejte svuj email: ");
				email = st.nextLine();
				
			}
			
			if(Vybern1.matches("[(1|Ano)]")) {
				OJm.setEmail(email);
			}else {
				OBezJmena.setEmail(email);
			}

//---//---//---//---//---//---
			
			System.out.println("\\nHeslo musi zacinat velkym pismenem.");
			System.out.println("Zadejte svoje heslo: ");
			String passw = st.nextLine();
			while (!passw.matches("[A-Z][a-zA-Z0-9]+")) {
				System.out.println("Spatne zadani hesla! Zkuste jeste jednou: ");
				passw = st.nextLine();
			}
			
			if(Vybern1.matches("[(1|Ano)]")) {
				OJm.setPasw(passw);
			}else {
				OBezJmena.setPasw(passw);
			}
			
			if(Vybern1.matches("[(1|Ano)]")) {
				PohlM.put(1, OJm);
				System.out.println(PohlM.get(1));
			}else {
				PohlM.put(1, OBezJmena);
				System.out.println(PohlM.get(1));
			}
			
			
			/*
			r.Email(email);
			r.Password(passw);*/
		}
	//--------------------------------------------------------	------------------------------------
		
		if(VyberP.equals("2")) {
			String email = null;
			Scanner st = new Scanner(System.in);
			Regex r = new Regex();
			
			System.out.println("Chces zadat svoje jmeno a prijmeni?");
			System.out.println("1 ... Ano");
			System.out.println("2 ... Ne");
			String Vybern1 = sc.nextLine();
			
			if(Vybern1.matches("[(1|Ano)]")) {
				System.out.println("Zadejte svoje jmeno:");
				Scanner jmenoM = new Scanner(System.in);
				jmeno = jmenoM.nextLine();
				OJm.setJmeno(jmeno);
				
				System.out.println("Zadejte svoje prijmeni: ");
				Scanner prijmeniM = new Scanner(System.in);
				prijmeni = prijmeniM.nextLine();
				OJm.setPrijmeni(prijmeni);
				
				System.out.println("Zadali jste to spravne? Jestli ne tak to muzete prepsat.");
				System.out.println(OJm.getJmeno());
				System.out.println(OJm.getPrijmeni());
				
				System.out.println("1 ... Ano");
				System.out.println("2 ... Ne");
				
				Scanner sp = new Scanner(System.in);
				String sprav = sp.nextLine();
				
				while(!sprav.matches("[(1|Ano)]")) {
					System.out.println("Zadejte svoje jmeno:");
					jmenoM = new Scanner(System.in);
					jmeno = jmenoM.nextLine();
					OJm.setJmeno(jmeno);
					
					System.out.println("Zadejte svoje prijmeni: ");
					prijmeniM = new Scanner(System.in);
					prijmeni = prijmeniM.nextLine();
					OJm.setPrijmeni(prijmeni);
					System.out.println("Zadali jste to spravne? Jestli ne tak to muzete prepsat.");
					
					System.out.println(OJm.getJmeno());
					System.out.println(OJm.getPrijmeni());
					
					System.out.println("1 ... Ano");
					System.out.println("2 ... Ne");

					sprav = sp.nextLine();
				}
			}
			
			
			System.out.println("Muzou se zadavat jenom ceske(.cz) nebo mezinarodni(.com) emaily.");
			System.out.println("Zadejte svuj email: ");
			email = st.nextLine();
			while (!email.matches("[a-zA-z0-9]+[@][a-z]+[.](cz|com)")) {
				System.out.println("Spatny email! Prosim zadejte jeste jednou: ");
				System.out.println("Zadejte svuj email: ");
				email = st.nextLine();
				
			}
			
			if(Vybern1.matches("[(1|Ano)]")) {
				OJm.setEmail(email);
			}else {
				OBezJmena.setEmail(email);
			}

//---//---//---//---//---//---
			
			System.out.println("\\nHeslo musi zacinat velkym pismenem.");
			System.out.println("Zadejte svoje heslo: ");
			String passw = st.nextLine();
			while (!passw.matches("[A-Z][a-zA-Z0-9]+")) {
				System.out.println("Spatne zadani hesla! Zkuste jeste jednou: ");
				passw = st.nextLine();
			}
			
			if(Vybern1.matches("[(1|Ano)]")) {
				OJm.setPasw(passw);
			}else {
				OBezJmena.setPasw(passw);
			}
			
			if(Vybern1.matches("[(1|Ano)]")) {
				PohlM.put(1, OJm);
				System.out.println(PohlM.get(1));
			}else {
				PohlM.put(1, OBezJmena);
				System.out.println(PohlM.get(1));
			}
			
			
		}
		
		/*
		 * String VyberP = sc.nextLine();
		 * 
		 * String rgx1 = "(1|2)";
		 * Pattern pt = Pattern.compile(rgx1);
		 * Matcher m = pt.matcher(VyberP);
		 * 
		 * while(m.find()) { VyberP = m.group(); System.out.println(m.group());
		 * 
		 * } while(VyberP == m.group()) { System.out.println("ne"); VyberP =
		 * sc.nextLine(); }
		 */

		
		
		/*
		System.out.println(zemail+" == "+ OJm.getEmail()+" || "+ zemail +" == "+OBezJmena.getEmail());
		if(zemail == OJm.getEmail() || zemail == OBezJmena.getEmail()) {
			System.out.println("Zadej password: ");
			Scanner sp = new Scanner(System.in);
			String zpass = sp.next();
			if(zpass == OJm.getPasw() || zpass == OBezJmena.getPasw()) {
				System.out.println("Vyborne! Prihlasil ses!");
			}
		}*/
		
		System.out.println("Pro prihlaseni zadejte svuj email: ");
		String zemail = new Scanner(System.in).next();
		
		String OJem = OJm.getEmail();
		String OBJem = OBezJmena.getEmail();
		
		String OJpa = OJm.getPasw();
		String OBJpa = OBezJmena.getPasw();
		
		if(zemail.equals(OBJem) || zemail.equals(OJem)) {
			System.out.println("Zadej password: ");
			Scanner sp = new Scanner(System.in);
			String zpass = sp.next();
			if(zpass.equals(OBJpa) || zpass.equals(OJpa)) {
				System.out.println("Vyborne! Prihlasil ses!");
			}
			
		}
		
	}

}
