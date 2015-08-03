package org.formation.fonctionnelle;


import java.util.Scanner;


public class Fonct0 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez une valeur comprise entre 0 et 1000");
		
		int a = readInt(sc);
		int sum = 0;
		
		for(int i = 1; i <= 1000; i *= 10) {
			sum += a / i % 10;
		}
		
		System.out.println("La somme des digits composant " + a + " est : " + sum);
		
		sc.close();
	}
	
	
	static int readInt(Scanner sc) {
		int ret = -1;
		while(ret < 0) {
			try {
				System.out.print("> ");
				ret = sc.nextInt();
				if(ret < 0 || ret > 1000) ret = -1;
			} catch(Exception e) {
				sc.nextLine();
			}
		}
		return ret;
	}

}
