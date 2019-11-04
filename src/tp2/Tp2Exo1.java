package tp2;

import java.util.Scanner;

public class Tp2Exo1 {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		System.out.println("Veuillez rentrez une valeur");
		int entier_1 = user.nextInt();
		System.out.println("Veuillez rentrez une valeur");
		int entier_2 = user.nextInt();
		
		System.out.println("Voici la somme des deux valeurs"+ (entier_1 + entier_2) + "et voici le produit"+ (entier_1 * entier_2));
	
	user.close();
	}

}
