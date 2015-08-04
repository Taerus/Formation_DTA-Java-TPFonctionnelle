package org.formation.fonctionnelle;

import java.util.Scanner;

public class TPArrayBreakLabelled0 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] tab = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
		
		System.out.println("Saisir une valeur :");
		int a = readInt(sc);
		boolean found = false;
		
		for(int i : tab) {
			if(i == a) {
				found = true;
				break;
			}
		}
		
		System.out.println(found ? "trouvé !" : "cette valeur n'existe pas");
		
		sc.close();
		
	}
	
	/**
	 * Reads the input until an integer value is entered and returns it
	 * @param sc the Scanner
	 * @return the value read by the scanner
	 */
	static int readInt(Scanner sc) {
		int ret = -1;
		while(ret < 0) {
			try {
				System.out.print("> ");
				ret = sc.nextInt();
			} catch(Exception e) {
				sc.nextLine();
			}
		}
		return ret;
	}

}
