package tp4;

import java.util.Scanner;

public class Tp4Exo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez une valeur entre 1 et 100");
		int user = sc.nextInt();
		int somme = 0;
		String affichage = "";
		for (int i = 0; i < user; i++) {
			somme += 2 * i + 1;
			if (i == 0) {
				affichage = Integer.toString((i + 1));
				affichage += "+";
			}
			if (i > 0 && i < user) {
				affichage += Integer.toString((2 * i + 1));
				if (i < (user - 1)) {
					affichage += "+";
				}
			}

		}
		System.out.println(somme + "(" + affichage + ")");
		sc.close();

	}

}
