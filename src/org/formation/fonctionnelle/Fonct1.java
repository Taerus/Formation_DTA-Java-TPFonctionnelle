package org.formation.fonctionnelle;

import java.util.Scanner;

public class Fonct1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("rayon");
		double r = readDouble(sc);
		
		System.out.println("hauteur");
		double h = readDouble(sc);
		
		double vol = Math.PI * r * r * h;
		System.out.println("volume = " + vol);
		
		sc.close();
	}
	
	/**
	 * Reads the input until a positive value is entered and returns it
	 * @param sc the Scanner
	 * @return the value read by the scanner
	 */
	static double readDouble(Scanner sc) {
		double ret = -1L;
		while(ret < 0) {
			try {
				System.out.print("> ");
				ret = sc.nextDouble();
				if(ret < 0) ret = -1L;
			} catch(Exception e) {
				sc.nextLine();
			}
		}
		return ret;
	}

}
