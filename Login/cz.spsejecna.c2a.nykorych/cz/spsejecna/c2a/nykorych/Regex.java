package cz.spsejecna.c2a.nykorych;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public String Email(String test) {
		String email = "";
		String rgx1 = "[a-zA-Z0-9]+[@][a-z]+[.](cz|com)";
		Pattern pt = Pattern.compile(rgx1);
		Matcher m = pt.matcher(test);

		while (m.find()) {
			email = m.group();
			System.out.println("Email: " + m.group());
		}
		if (email.isEmpty()) {
			System.out.println("Spatny email.");
		}
		return email;
	}
	
	public String Password(String test) {
		String Pass="";
		String rgx1 = "[A-Z][a-zA-Z0-9]+";
		Pattern pt = Pattern.compile(rgx1);
		Matcher m = pt.matcher(test);
		
		while(m.find()) {
			Pass = m.group();
			System.out.println("Password: "+m.group());
		}
		if(Pass.isEmpty()) {
			System.out.println("Spatne heslo.");
		}
		
		return Pass;
	}
	
}
