package tp3;

import java.util.Scanner;

/* EXO 1 : Réaliser un programme qui permet de traiter (lire et afficher) tous les types primitifs du langage JAVA,
//ainsi   que les chaînes de caractères (String).    Rappel : Les types primitifs sont : boolean, byte, char, short, int, long, float et double.
//Remarques :  La saisie d'une valeur réelle se fait en utilisant une virgule et non pas un point.
//La saisie d'un booléen se fait en tapant false ou true (et non pas 0 ou 1).    Lecture.clavier.nextLine(); // Vide le tampon clavier. */

public class Tp3Exo1 {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		
		try {
			System.out.println("Veuillez entrez une valeur entre -128 127");
			byte bite_user = user.nextByte();
			System.out.println(bite_user);
		} catch (Exception e) {
			System.out.println("entrez invalide");
		}
		
		try {
			user.nextLine(); //permet de vider l'erreur de la mise en tampon de la rentrée
			System.out.println("Veuillez entrez une valeur entre true et false");
			boolean flag = user.nextBoolean();
			System.out.println(flag);
		} catch (Exception e) {
			System.out.println("entrez invalide");
		}
		
		try {
			user.nextLine();
			System.out.println("Veuillez entrez un char");
			char char_user = user.next().charAt(0);
			System.out.println(char_user);
		} catch (Exception e) {
			System.out.println("entrez invalide");
		}
		
		try {
			user.nextLine();
			System.out.println("Veuillez entrez un short entre -32768 et 32767");
			short short_user = user.nextShort();
			System.out.println(short_user);
		} catch (Exception e) {
			System.out.println("entrez invalide");
		}
		
		try {
			user.nextLine();
			System.out.println("Veuillez entrez un int entre -2147483 648 et 2147483 648");
			int int_user = user.nextInt();
			System.out.println(int_user);
		} catch (Exception e) {
			System.out.println("entrez invalide");	
		}
		
		try {
			user.nextLine();
			System.out.println("Veuillez entrez un long -9223372036854775 808 et 9223372036854775 808");
			long long_user = user.nextLong();
			System.out.println(long_user);
		} catch (Exception e) {
			System.out.println("entrez invalide");	
		}
		
		try {
			user.nextLine();
			System.out.println("Veuillez entrez un float entre +/-1,4e-45 et +/-3,4e38");
			float float_user = user.nextFloat();
			System.out.println(float_user);
		} catch (Exception e) {
			System.out.println("entrez invalide");	
		}
		
		
		try {
			user.nextLine();
			System.out.println("Veuillez entrez un double entre +/. 4,940e-324 et +/-1,797e308");
			double double_user = user.nextDouble();
			System.out.println(double_user);
		} catch (Exception e) {
			System.out.println("entrez invalide");
		}
		
		try {
			user.nextLine();
			System.out.println("Veuillez saisir un String");
			String string_user = user.next();
			System.out.println(string_user);
		} catch (Exception e) {
			System.out.println("entrez invalide");	
		}
		
		
		
		
	user.close();	
	}

}
