package tp6;

public class Tp6Exo5 {

	public static void main(String[] args) {
		char valeur_car ;
		String valeur_hexa;
		for (int i = 32; i < 128; i++) {
			valeur_car = (char)i;
			valeur_hexa = Integer.toHexString(i);
			System.out.println(i + " ->  "+ valeur_car + " -> " + valeur_hexa	);
			
		}

	}

}
