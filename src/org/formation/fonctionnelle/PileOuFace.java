package org.formation.fonctionnelle;

import java.util.Scanner;

public class PileOuFace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("choisir 1 ou 0");
		int c = readInt(sc);
		int p = (int) (2 * Math.random());
		
		if(c == p) {
			System.out.println("bravo !");
		} else {
			System.out.println( p == 0 ? "C'est pile" : "C'est face" );
		}
		
		sc.close();

	}
	
	/**
	 * Reads the input until a value in the range 0-1 is entered and returns it
	 * @param sc the Scanner
	 * @return the value read by the scanner
	 */
	static int readInt(Scanner sc) {
		int ret = -1;
		while(ret < 0) {
			try {
				System.out.print("> ");
				ret = sc.nextInt();
				if(ret < 0 || ret > 1) ret = -1;
			} catch(Exception e) {
				sc.nextLine();
			}
		}
		return ret;
	}

}
