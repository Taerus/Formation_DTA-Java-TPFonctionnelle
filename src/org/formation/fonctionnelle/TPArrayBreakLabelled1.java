package org.formation.fonctionnelle;

import java.util.Scanner;

public class TPArrayBreakLabelled1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] tab = {
				{32, 87, 3, 589},
				{12, 1076, 2000, 8},
				{622, 127, 77, 955}
		};

		System.out.println("Saisir une valeur :");
		int a = readInt(sc);
		int i = 0, j = 0;
		boolean found = false;

		loop:
		for (i = 0; i < tab.length; i++) {
			for (j = 0; j < tab[i].length; j++) {
				if (tab[i][j] == a) {
					found = true;
					break loop;
				}
			}
		}

		System.out.println(found ? "trouvé à l'indice "+i+","+j : "cette valeur n'existe pas");

		sc.close();

	}

	/**
	 * Reads the input until an integer value is entered and returns it
	 * 
	 * @param sc
	 *            the Scanner
	 * @return the value read by the scanner
	 */
	static int readInt(Scanner sc) {
		int ret = -1;
		while (ret < 0) {
			try {
				System.out.print("> ");
				ret = sc.nextInt();
			} catch (Exception e) {
				sc.nextLine();
			}
		}
		return ret;
	}

}
