package tp7;

public class Tp7Exo1 {

	public static double surface(int rayon) {
		return Math.PI * Math.pow(rayon, 2);
	}

	public static double perimetre(int rayon) {
		return( 2 * Math.PI * rayon);
	}

	public static void main(String[] args) {
		System.out.println("voici le calcul de la surface de 5 : "+ surface(5)+ " et le calcul du perimetre de 5 "+ perimetre(5));
	}

}
