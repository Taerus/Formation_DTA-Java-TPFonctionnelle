package org.formation.fonctionnelle;

import java.util.HashMap;
import java.util.Map;

public class FonctProblemeAdresses {

	public static void main(String[] args) {
		
		String[] emails = {
				"bob@sfr.fr",
				"bernard@gmail.com",
				"toto@gmail.com",
				"gerard@hotmail.fr",
				"arthur@orange.fr",
				"philipe@hotmail.fr",
				"silvie@gmail.com",
				"richard@gmail.com",
				"tom@sfr.fr",
				"kevin@wanadoo.fr"
		};
		
		HashMap<String, Integer> domainMap = new HashMap<>();
		
		for ( String email : emails ) {
			System.out.println(email);
			String domain = getDomain(email);
			int count = domainMap.containsKey(domain) ? domainMap.get(domain) : 0;
			domainMap.put(domain, ++count);
		}
		
		System.out.println("===================================");
		
		HashMap<String, Float> domainRatioMap = new HashMap<>();
		
		for ( Map.Entry<String, Integer> peer : domainMap.entrySet()) {
			float p = (float) peer.getValue() / (float) emails.length * 100.f;
			domainRatioMap.put(peer.getKey(), p);
			System.out.println(peer.getKey() + " : " + p + "%");
		}
		
	}
	
	static String getDomain(String email) {
		return (email.split("@"))[1].toLowerCase();
	}

}
