package tp4;

import java.util.Scanner;

public class Tp4Exo4Variante {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez un nombre");
		int user = sc.nextInt();
		
		for (int i = 1; i <= user;) {
			int premier = 1;
			for (int j = 2; j <= i; j++) {
				if ((i % j) == 0 && j != i) {
					premier = 0;
				}
			}
			if (premier != 0) {
				System.out.println(i + " est un nombre premier");
				i++;
			} else
				i++;

		}
		sc.close();
	}

}


