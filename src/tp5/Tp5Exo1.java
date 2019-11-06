package tp5;

import java.util.Scanner;

public class Tp5Exo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tab_user[] = new int[5];
		
		/* === COMMENTER POUR LA CORRECTION ====
		for (int i = 0; i < tab_user.length; i++) {
			System.out.println("Remplissez le tableau");
			tab_user[i] = sc.nextInt();
		} */
		
		int tab[] = {1,10,20,35,40,80,5,8,0,0}; //pour correction
		int max = 0;
		int compteur = 0;
		
		for (int i = 0; i < tab.length; i++) {
			if(max < tab[i]) {
				max = tab[i];
				
			}
			if(tab[i] == 0) {
				compteur++;
			}
			
		}System.out.println("Voici le nombre de 0 : "+compteur + " et le chiffre max est "+max);
		
	sc.close();
	}

}
