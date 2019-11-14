package tp6;

import java.util.Scanner;

public class Tp6Exo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texte = "ici le text de test pour pouvoir inverser la chaine de caractère";
		String replace = "";
		
		for (int i=texte.length()-1 ; i>=0; i--) {
			replace += texte.charAt(i);
		}
		System.out.println("Voici le texte non inversé : "+ texte);
		System.out.println("Voici le texte inversé : "+replace);
		sc.close();
	}

}
