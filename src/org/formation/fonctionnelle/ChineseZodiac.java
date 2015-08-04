package org.formation.fonctionnelle;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez votre Année de naissance :");
		
		Zodiac sign = Zodiac.getByDate(readInt(sc));
		System.out.print(sign.name);
		
		switch (sign) {
		case RABBIT:
			System.out.println(" =:3");
			break;
			
		default :
			System.out.println("");
			break;
		}
		
		/*switch (readInt(sc) % 12) {
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
			break;
		}*/
		
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
	
	static enum Zodiac {
		MONKEY 	("Singe"),
		ROOSTER ("Coq"),
		DOG 	("Chien"),
		PIG 	("Porc"),
		RAT 	("Rat"),
		OX 		("Boeuf"),
		TIGER 	("Tigre"),
		RABBIT 	("Lapin"),
		DRAGON 	("Dragon"),
		SNAKE 	("Serpent"),
		HORSE 	("Cheval"),
		SHEEP 	("Mouton");
		
		Zodiac(String name) {
			this.name = name;
		}
		
		public final String name;
		
		/**
		 * Returns the sign associated to its Id
		 * @param id the identifier of the sign
		 * @return the sign
		 * @throws Exception if the Id is not in the range 0-11
		 */
		public static Zodiac getById(int id) throws IndexOutOfBoundsException {
			Zodiac sign = null;
			
			try {
				sign = (Zodiac.values())[id];
			} catch (ArrayIndexOutOfBoundsException e) {
				throw new IndexOutOfBoundsException("Invalid sign Id");
			}
			
			return sign;
		}
		
		/**
		 * Returns the sign associated to a year
		 * @param year the year of the sign you are looking for
		 * @return the sign associated to a year
		 */
		public static Zodiac getByDate(int year) {
			return (Zodiac.values())[year % 12];
		}
	}

}
