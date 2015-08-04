package org.formation.fonctionnelle;

public class StringvsBuilder {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		final int N = 10000;
		
		String lievre;
		String tortue = "";
		long time;
		
		time = System.currentTimeMillis();
		for(int i = 0; i < N; i++) {
			tortue = tortue + i + ' ';
		}
		System.out.println();
		System.out.println("tortue : " + (System.currentTimeMillis() - time));
		
		time = System.currentTimeMillis();
		StringBuilder strBuilder = new StringBuilder();
		for(int i = 0; i < N; i++) {
			strBuilder.append(i);
			strBuilder.append(' ');
		}
		lievre = strBuilder.toString();
		System.out.println("lièvre : " + (System.currentTimeMillis() - time));
		
	}

}
