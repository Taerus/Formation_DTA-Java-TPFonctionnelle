package org.formation.fonctionnelle;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez votre Année de naissance :");
		
		switch (readInt(sc) % 12) {
		case 0:
			System.out.println("Singe");
			break;
		case 1:
			System.out.println("Coq");
			break;
		case 2:
			System.out.println("Chien");
			break;
		case 3:
			System.out.println("Porc");
			break;
		case 4:
			System.out.println("Rat");
			break;
		case 5:
			System.out.println("Boeuf");
			break;
		case 6:
			System.out.println("Tigre");
			break;
		case 7:
			System.out.println("Lapin =:3");
			break;
		case 8:
			System.out.println("Dragon");
			break;
		case 9:
			System.out.println("Serpent");
			break;
		case 10:
			System.out.println("Cheval");
			break;
		case 11:
			System.out.println("Mouton");
			break;
		default:
			System.out.println("=O");
			break;
		}
		
		sc.close();

	}
	
	/**
	 * Reads the input until an integer is entered and returns it
	 * @param sc the Scanner
	 * @return the value read by the scanner
	 */
	static int readInt(Scanner sc) {
		int ret = -1;
		do {
			try {
				System.out.print("> ");
				ret = sc.nextInt();
			} catch(Exception e) {
				sc.nextLine();
			}
		} while(ret < 0);
		return ret;
	}

}
