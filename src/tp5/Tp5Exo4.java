package tp5;

import java.util.Scanner;

public class Tp5Exo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de note ?");
		int user = sc.nextInt();
		int compteur = 0;
		float tab_entree[] = new float[user];
		float result = 0;
		int nb_note= 0;
		while (compteur < user) {
			System.out.println("Note " + (compteur + 1));
			tab_entree[compteur] += sc.nextFloat();
			compteur++;
		}
		for (int i = 0; i < tab_entree.length; i++) {
			result += tab_entree[i];
		}
		float la_moyenne = result/user;
		System.out.println("voici la moyenne des "+user+" notes : "+ Math.floor(la_moyenne*100)/100);
		
		for (int i = 0; i < tab_entree.length; i++) {
			if(tab_entree[i] > la_moyenne) {
				nb_note++;
			}
		}
		System.out.println("voici le nombre de note supérieur à la moyenne de la classe "+ nb_note);
		
		sc.close();

	}

}
