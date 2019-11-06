package tp4;

import java.util.Scanner;

public class Tp4Exo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("combien de lignes ?");
		int user = sc.nextInt();
		
		for (int i = 0; i < user; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		sc.close();
	}

}
