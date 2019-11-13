package tp4;

import java.util.Scanner;

public class Tp4Exo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un nombre entier");
		int user = sc.nextInt();
		System.out.println("Rentrez un nombre entre 0 et 31");
		int user_bit = sc.nextInt();
		int reste = 0;
		String resultat = "";
		
		
		while (reste > 0) {
			resultat = reste % 2 + resultat;
			reste = reste / 2;
		}
		System.out.println("voici le resultat en base 2 : " + resultat);
		
		sc.close();
	}

}
