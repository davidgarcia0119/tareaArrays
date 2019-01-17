package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej260 {
//Daniel Dominguez
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arraypalabra = new char[500];
		char[] arraypalabra2 = new char[500];
		int casos;
		casos = sc.nextInt();
		sc.nextLine();
		String palabra1;
		String palabra2;

		for (int i = 0; i < casos; i++) {

			palabra1 = sc.nextLine();
			palabra1 = palabra1.toLowerCase();
			palabra1 = palabra1.replace(" ", "");

			palabra2 = sc.nextLine();
			palabra2 = palabra2.toLowerCase();
			palabra2 = palabra2.replace(" ", "");

			arraypalabra = palabra1.toCharArray();
			arraypalabra2 = palabra2.toCharArray();

			Arrays.sort(arraypalabra);
			Arrays.sort(arraypalabra2);
			if (arraypalabra.length == arraypalabra2.length) {
				if (String.valueOf(arraypalabra).equals(String.valueOf(arraypalabra2))) {
					System.out.println("SI");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}

		}
	}
}
