package org.formation.fonctionnelle;

import java.util.Scanner;

public class GradeEvaluator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("saisir la note :");
		int note = readInt(sc);

		if (note > 89) {
			System.out.println("Vous avez un A");
		} else if (note > 79) {
			System.out.println("Vous avez un B");
		} else if (note > 63) {
			System.out.println("Vous avez un C");
		} else {
			System.out.println("Vous avez un F");
		}

		sc.close();

	}

	static int readInt(Scanner sc) {
		int ret = -1;
		while (ret < 0) {
			try {
				System.out.print("> ");
				ret = sc.nextInt();
				if (ret < 0 || ret > 100)
					ret = -1;
			} catch (Exception e) {
				sc.nextLine();
			}
		}
		return ret;
	}

}
