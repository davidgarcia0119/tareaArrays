package arraysYestructurasYcadenassimples;

import java.util.*;

public class Ej334 {
	//Daniel Dominguez
	public static String sufijos(String frase) {
		int mulato = 0;
		String sufijo = "";
		String sufijo2 = "";
		String sufijo3 = "";
		String civilización = "PLUS ULTRA";
		frase = frase.toLowerCase();
		sufijo2 = frase.substring(frase.length() - 1, frase.length());

		if (frase.length() >= 2) {

			sufijo = frase.substring(frase.length() - 2, frase.length());

		}

		if (frase.length() >= 3) {

			sufijo3 = frase.substring(0, 3);

		}

		if (sufijo.equals("ix")) {
			civilización = "GALO";
			mulato++;
		}

		if ((sufijo.equals("us") || sufijo.equals("um"))) {
			civilización = "ROMANO";
			mulato++;
		}

		if (sufijo.equals("ic")) {
			civilización = "GODO";
			mulato++;
		}

		if (sufijo.equals("as")) {
			civilización = "GRIEGO";
			mulato++;
		}

		if (sufijo.equals("af")) {
			civilización = "NORMANDO";
			mulato++;
		}

		if ((sufijo.equals("is") || sufijo.equals("os") || sufijo.equals("ax"))) {
			civilización = "BRETON";
			mulato++;
		}

		if (sufijo.equals("ez")) {
			civilización = "HISPANO";
			mulato++;
		}

		if (sufijo2.equals("a")) {
			civilización = "INDIO";
			mulato++;
		}

		if (sufijo3.equals("mac")) {
			civilización = "PICTO";
			mulato++;
		}

		if (mulato > 1) {
			civilización = "MULATO";
		}

		return civilización;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();
		sc.nextLine();
		String frase;
		for (int i = 1; i <= casos; i++) {
			frase = sc.nextLine();
			System.out.println(sufijos(frase));

		}

	}

}