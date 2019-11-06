package tp4;

import java.util.Scanner;

public class Tp4Exo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donnez un nombre");
		int user = sc.nextInt();
		int compteur = 2;
		boolean flag = true;
		while (compteur < user && flag) {
			System.out.println("voici le diviseur " + compteur + " voici le reste " + (user % compteur));
			if (user % compteur == 0) {
				flag = false;
			}
			compteur++;
		}
		if (flag) {
			System.out.println(user + " est un nombre premier");
		} else {
			System.out.println(user + " n'est pas un nombre premier");
		}
		sc.close();
	}

}
