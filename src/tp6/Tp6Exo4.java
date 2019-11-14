package tp6;

import java.util.Arrays;
import java.util.Scanner;

public class Tp6Exo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("rentrez un texte");
		String userEntry = sc.nextLine();
		String char_tri = "";
		int tab_unicode[] = new int[userEntry.length()];
		int tmp = 0;

		System.out.println("taille de la chaine : " + userEntry.length());

		// Conversion de ma chaine de car en int
		for (int i = 0; i < tab_unicode.length; i++) {
			tab_unicode[i] += (int) userEntry.charAt(i);
		}

		System.out.println("Avant tri à bulle : " + Arrays.toString(tab_unicode));
		// tri à bulle
		for (int i = 0; i < tab_unicode.length; i++) {
			for (int j = 1; j < (tab_unicode.length - i); j++) {
				if (tab_unicode[j - 1] > tab_unicode[j]) {
					tmp = tab_unicode[j - 1];
					tab_unicode[j - 1] = tab_unicode[j];
					tab_unicode[j] = tmp;
				}
			}
		}
		System.out.println("Après tri à bulle : " + Arrays.toString(tab_unicode));
		
		//stock du tri et conversion en char
		for (int i = 0; i < tab_unicode.length; i++) {
			char_tri += (char) tab_unicode[i];
			char_tri += " ";
		}
		System.out.println("Voici le texte trié par ordre alpha : "+ char_tri);
		sc.close();
	}

}
