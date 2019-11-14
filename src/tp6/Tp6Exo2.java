package tp6;

import java.util.Scanner;

public class Tp6Exo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("rentrez une ligne de texte");
		String user = sc.nextLine();
		String supp_char = "";

		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i) != 'e') {
				supp_char += user.charAt(i);
			}
		}
		System.out.println("Voici le texte avec e " + user);
		System.out.println("Voici mon texte sans e :" + supp_char);

		sc.close();
	}

}
