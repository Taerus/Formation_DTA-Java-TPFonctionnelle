package org.formation.fonctionnelle;

public class FonctFor {

	public static void main(String[] args) {

		// Etape 1

		for (int i = 0; i <= 12; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		// Etape 2

		int[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		for (int i : values) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		// Etape 3

		{
			final String MA_VILLE = "Vannes";
			String[] villes = { "Rennes", "Paris", "Vannes", "Rouen", "Nantes", "Evreux" };
			for (String ville : villes) {
				System.out.print(ville + " ");
				if (ville.equalsIgnoreCase(MA_VILLE)) {
					System.out.println("c'est ma ville préférée !");
				} else {
					System.out.println("...");
				}
			}
			System.out.println("\n");
		}

		
		// Enum

		{
			final Ville MA_VILLE = Ville.VANNES;
			for (Ville ville : Ville.values()) {
				System.out.print(ville.name + " ");
				if (ville.equals(MA_VILLE)) {
					System.out.println("c'est ma ville préférée !");
				} else {
					System.out.println("...");
				}
			}
		}

	}

	static enum Ville {
		RENNES	("Rennes"),
		PARIS	("Paris"),
		VANNES	("Vannes"),
		ROUEN	("Rouen"),
		NANTES	("Nantes"),
		EVREUX	("Evreux");

		final String name;

		Ville(String name) {
			this.name = name;
		}
	}

}
