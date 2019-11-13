package tp4;

import java.util.Arrays;

public class Tp4Exo8 {

	public static void main(String[] args) {
		int suite[] = new int[20];
		suite[0] = 1;
		suite[1] = 2;
		for (int i = 2; i < suite.length; i++) {
			suite[i] = suite[i - 1] + suite[i - 2];
		}
		System.out.println(Arrays.toString(suite));
		float result;
		for (int i = 1; i < suite.length; i++) {
			result = suite[i] / (float)suite[i - 1];
			if (result > 1.6181) {
				System.out.println("etape " + i +" : "+ result + " trop grand");
			}else if(result < 1.6179) {
				System.out.println("etape " + i +" : "+result + " trop petit");
			}else {
				System.out.println("etape " + i +" voici le bon chiffre : "+ suite[i]+"/"+ suite[i-1] + " = " + result);
				break;
			}
		}
		
	}

}
