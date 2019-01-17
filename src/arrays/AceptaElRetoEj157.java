package arrays;

import java.util.Scanner;

public class Ej157 {
// David Garcia
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cuantofalta = 0;
		int casos = 0;

		int soluciones[];

		Scanner sc = new Scanner(System.in);

		casos = sc.nextInt();
		soluciones = new int[casos];

		for (int i = 0; i < casos; i++) {

			int dia = sc.nextInt();
			int mes = sc.nextInt();

			if (mes == 1) {
				cuantofalta = 365 - dia;
			}
			if (mes == 2) {
				cuantofalta = 334 - dia;
			}
			if (mes == 3) {
				cuantofalta = 306 - dia;
			}
			if (mes == 4) {
				cuantofalta = 275 - dia;
			}
			if (mes == 5) {
				cuantofalta = 245 - dia;
			}
			if (mes == 6) {
				cuantofalta = 214 - dia;
			}
			if (mes == 7) {
				cuantofalta = 184 - dia;
			}
			if (mes == 8) {
				cuantofalta = 153 - dia;
			}
			if (mes == 9) {
				cuantofalta = 122 - dia;
			}
			if (mes == 10) {
				cuantofalta = 92 - dia;
			}
			if (mes == 11) {
				cuantofalta = 61 - dia;
			}
			if (mes == 12) {
				cuantofalta = 31 - dia;
			}

			soluciones[i] = cuantofalta;

		}
		// una vez tenemos los datos los imprimimos
		for (int j = 0; j < soluciones.length; j++) {
			System.out.println(soluciones[j]);
		}
	}
}
