package tp5;

public class TP5Exo1V2 {
	public static void main(String[] args) {
		int tab[][] = { { 1, 10, 20, 35, 40, 80, 5, 8, 0, 0 }, { 48, 7, 28, 12, 35 } }; // pour correction
		int max = 0;
		int compteur = 0;

		for (int i = 0; i < tab.length; i++) {

			for (int j = 0; j < tab[i].length; j++) {

				if (max < tab[i][j]) {
					max = tab[i][j];

				}
				if (tab[i][j] == 0) {
					compteur++;
				}
			}

		}
		System.out.println("Voici le nombre de 0 : " + compteur + " et le chiffre max est " + max);

	}
}
