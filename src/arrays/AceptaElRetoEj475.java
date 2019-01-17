package arrays;

import java.util.Scanner;

public class Ej475 {
	public static void main(String[] args) {
		
		// Codigo de Jorge de Paz.
		
		Scanner in1 = new Scanner(System.in);
		int nCasos = in1.nextInt();
		in1.nextLine();
		String aux = "";
		int count = 0;
		char[] stan = { 's', 't', 'a', 'n', 'l', 'e', 'e' };
		for (int z = 0; z < nCasos; z++) {
			String frase = in1.nextLine().toLowerCase();
			int token = 0;
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == stan[token]) {
					token++;
					if (token == stan.length) {
						count++;
						token = 0;
					}
				}
			}
			System.out.println(count);
			count = 0;
		}
	}
}
