package tp4;

import java.util.Arrays;
import java.util.Scanner;

public class Tp4Exo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez un nombre entier");
		int user = sc.nextInt();		
		int reste = user;
		int tab_result[] = new int[32];
		int i = 0;
		
		while (reste > 0) {
			tab_result[i] = reste % 2;
			reste = reste / 2;
			i++;
		}
		System.out.println("voici le resultat en base 2 : " + Arrays.toString(tab_result));
		System.out.println("Rentrez un nombre entre 0 et 31");
		int user_bit = sc.nextInt();
		System.out.println(tab_result[user_bit]);
		sc.close();
	}

}
