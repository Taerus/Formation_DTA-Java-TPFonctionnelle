package org.formation.fonctionnelle;

public class FonctAvanceDoWhile1 {

	public static void main(String[] args) {
		
		
		// solution simple
		{
			int[] tab = new int[3];
			int count = 0;
			boolean valid;
			
			do {
				count ++;
				for(int i = 0; i < tab.length; i++) {
					tab[i] = (int) (Math.random() * 1001);
				}
				valid = tab[0] % 2 == 0
				     && tab[1] % 2 == 0
				     && tab[2] % 2 == 1;
			} while (!valid);
			
			System.out.println(count + " tentatives");
			for (int i : tab) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n");
		
		// solution compliquée =P
		{
			int[] e = {0, 0, 1};
			
			/*e = new int[20];
			for(int i = 0; i < e.length; i++) {
				e[i] = (int) (Math.random() * 2);
			}*/
			
			int[] tab = new int[e.length];
			int count = 0;
			
			loop :
			while (true) {
				count ++;
				for(int i = 0; i < tab.length; i++) {
					tab[i] = (int) (Math.random() * 1001);
					if(tab[i] % 2 != e[i]) {
						continue loop;
					}
				}
				break;
			}
			
			System.out.println(count + " tentatives");
			for (int i : tab) {
				System.out.print(i + " ");
			}
		}
		
	}

}
