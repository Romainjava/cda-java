package tp4;

import java.util.Scanner;

public class Tp4Exo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float moyenne = 0;
		float answer = 0;
		int compteur = 0;
		int condition = 0;
		while (condition >= 0) {
			System.out.println("Note " + (compteur + 1));
			answer += sc.nextFloat();
			if (answer >= 0) {
				moyenne += answer;
			}else {
				condition -= 1;
			}
			compteur++;
		}
		System.out.println("voici la moyenne des " + compteur + " notes : " + Math.floor(moyenne * 100) / 100);
		
	sc.close();
	}

}
