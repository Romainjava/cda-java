package tp3;

import java.util.Scanner;

public class Tp3Exo4 {

	public static void main(String[] args) {
		System.out.println("Veuillez entrez un nombre en seconde");
		Scanner user = new Scanner(System.in);
		int heure, minute, seconde, nb_seconde;

		System.out.println("Veuillez entrer l'heure");
		heure = user.nextInt();
		System.out.println("Veuillez entrer le nombre de minute");
		minute = user.nextInt();
		System.out.println("Veuillez entrer le nombre de seconde");
		seconde = user.nextInt();

		nb_seconde = heure * 3600 + minute * 60 + seconde;

		System.out.println(heure+"h "+minute+" minute"+" et "+seconde+"s est egal à " + nb_seconde);

		user.close();
	}

}
