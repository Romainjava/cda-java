package tp5;

import java.util.Scanner;

public class Tp5Exo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot ?");
		String mot = sc.nextLine();
		int longueur = mot.length() - 1;
		int i = 0;
		boolean flag = true;

		while (i < longueur && flag) {
			if (mot.charAt(i) == mot.charAt(longueur - i)) {
				flag = true;
			} else {
				flag = false;
			}
			i++;
		}
		
		if(flag) {
			System.out.println(mot + " est un palindrome");
		}else {
			System.out.println(mot + " n'est pas un palindrome");
		}

		sc.close();
	}

}
