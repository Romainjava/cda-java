package tp6;

import java.util.Scanner;

public class Tp6Exo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rentrez un texte");
		String user = sc.nextLine();
		char user_char;
		int count = 0;
		
		for (int i = 0; i < user.length(); i++) {
			user_char += user.charAt(i);
			if(user_char == "e") {
				count++;
			}
		}
		System.out.println("Voici le nombre de e dans la phrase, "+ count);
		
		sc.close();
	}

}