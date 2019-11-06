package tp4;

import java.util.Scanner;

public class Tp4Exo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int code = 2747;		
		int essai = 5;
		boolean flag = false;
		while(essai !=0 && !flag) {
			System.out.println("Veuillez saisir le code");
			int user = sc.nextInt();
			if (user == code) {
				System.out.println("Code validé");
				flag = true;
			} else {
				System.out.println("Mauvais code, essai restant "+ (essai - 1));
				essai -= 1;
				flag = false;
			}
		}
		if(flag != true) {
			System.out.println("Votre nombre d'essai est fini, compte bloqué");
		}
	
		sc.close();
	}

}
