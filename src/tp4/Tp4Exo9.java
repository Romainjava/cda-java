package tp4;

import java.math.BigInteger;

public class Tp4Exo9 {

	public static void main(String[] args) {
		BigInteger pion = new BigInteger("1");
		int puiss = 63;
		for (int i = 0; i < puiss; i++) {
			pion = pion.multiply(new BigInteger("2"));
		}
		long entier_long = (long)Math.pow(2, puiss);
		System.out.println(pion);
		System.out.println(entier_long);
	}

}
