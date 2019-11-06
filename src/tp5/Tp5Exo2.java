package tp5;

public class Tp5Exo2 {

	public static void main(String[] args) {
		int mat_1[][] = { {1,2,3,4,5,5},{1,2,3,4,5,5},{1,2,3,4,5,5},{1,2,3,4,5,5},{1,2,3,4,5,5},{1,2,3,4,5,5}}; 
		int mat_2[][] = { {1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3} };
		int produit_matrice[][] = new int[mat_1.length][mat_2[0].length];
		System.out.println(mat_1[0].length +"+"+ mat_2.length);

		for (int row = 0; row < mat_1.length; row++) {	
			for (int col = 0; col < mat_2[row].length; col++) {
				for (int i = 0; i < mat_2.length; i++) {
					produit_matrice[row][col] += mat_1[row][i] * mat_2[i][col];

				}

			}
		}
		System.out.println("Résultat : ");
		for (int row = 0; row < produit_matrice.length; row++) {
			for (int col = 0; col < produit_matrice[row].length; col++) {
				System.out.print(produit_matrice[row][col]+ " ");
			}
			System.out.println();
		}
	}

}
