package tp5;

import java.util.HashMap;
import java.util.Scanner;

public class Tp5Exo6 {

	public static void main(String[] args) {
		HashMap<Integer, String> dico = new HashMap<Integer, String>();
		dico.put(10, "A");
		dico.put(11, "B");
		dico.put(12, "C");
		dico.put(13, "D");
		dico.put(14, "E");
		dico.put(15, "F");
		dico.put(16, "G");
		System.out.println(dico);
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un chiffre decimal");
		int user = sc.nextInt();
		int reste = user;
		String resultat = "", resultat_2 = "";
		while (reste > 0) {
			resultat = reste % 2 + resultat;
			reste = reste / 2;
		}
		System.out.println("voici le resultat en base 2 : " + resultat);
		while (user > 0) {
			reste = user % 16;
			if (reste >= 10) {
				resultat_2 = dico.get(reste) + resultat_2;
			} else {
				resultat_2 = reste + resultat_2;
			}
			user = user / 16;
		}
		System.out.println(resultat_2);

		sc.close();
	}

}
