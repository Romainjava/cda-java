package tp7;

import java.util.Scanner;

public class Tp7Exo2 {

	public static String plusGrand(int a, int b, int c) {
		int nb_max = 0;
		
		if (nb_max < a) {
			nb_max = a;
		}

		if (nb_max < b) {
			nb_max = b;
		}

		if (nb_max < c) {
			nb_max = c;
		}
		String result = "Votre nb max est " + nb_max;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez les trois nb à comparer");
		System.out.println(plusGrand(sc.nextInt(), sc.nextInt(), sc.nextInt()));
	}

}
