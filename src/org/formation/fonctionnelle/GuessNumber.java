package org.formation.fonctionnelle;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean playAgain;
	
		do {
			int val = (int) (Math.random() * 1000);
			int i, count = 0;
			
			System.out.println("Entrez une valeur entre 0 et 1000");
			do {
				i = readInt(sc);
				if(i != val) {
					System.out.println(i < val ? "c'est plus" : "c'est moins");
				}
				count++;
			} while (i != val);
			System.out.println(val + " trouvé en " + count + " tentatives");
			
			System.out.println("Souhaitez vous rejouer ? (y/n)");
			playAgain = sc.nextLine().trim().equalsIgnoreCase("y");
		} while(playAgain);
		
		sc.close();

	}
	
	/**
	 * Reads the input until a value in the range [0-1000[ is entered and returns it
	 * @param sc the Scanner
	 * @return the value read by the scanner
	 */
	static int readInt(Scanner sc) {
		int ret = -1;
		while(ret < 0) {
			try {
				System.out.print("> ");
				ret = sc.nextInt();
				if(ret < 0 || ret >= 1000) ret = -1;
			} catch(Exception e) {
				
			} finally {
				sc.nextLine();
			}
		}
		return ret;
	}

}
