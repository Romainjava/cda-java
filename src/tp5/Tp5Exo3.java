package tp5;

import java.util.Scanner;

public class Tp5Exo3 {

	static void displayTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien de case ?");
		int entry = sc.nextInt();
		int user[] = new int[entry];
		int tmp = 0;
		for (int i = 0; i < entry; i++) {
			System.out.println("Veuillez rentrer un chiffre");
			user[i] += sc.nextInt();
		}

		for (int i = 0; i < user.length; i++) {
			for (int j = 1; j < (user.length -i); j++) {
				if (user[j - 1] > user[j]) {
					tmp = user[j - 1];
					user[j - 1] = user[j];
					user[j] = tmp;

				}
			}
		}
		displayTab(user);

		sc.close();
	}

}
