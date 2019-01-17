package arrays;
//Carlos Rey Gonzalez

import java.util.Scanner;

public class Ej124 {
	static Scanner ent;

	public static void main(String args[]) {
		ent = new Scanner(System.in);

		while (comprobar()) {
		}
	}

	private static boolean comprobar() {
		String num1 = ent.next(), num2 = ent.next(), mayor, menor;

		if (num1.equals("0") && num2.equals("0")) {
			return false;
		}

		if (num1.length() > num2.length()) {
			mayor = num1;
			menor = num2;
		} else {
			menor = num1;
			mayor = num2;
		}
		int lonmin = menor.length(), lonmax = mayor.length(), numllevo = 0, llevada = 0, j, i; 
		for (i = menor.length() - 1, j = mayor.length() - 1; i >= 0; i--, j--) {
			int char1 = mayor.charAt(j) - '0'; 
			int char2 = menor.charAt(i) - '0'; 
			if ((char1 + char2 + llevada) > 9) { 
				numllevo++; 
				llevada = 1; 
			} else {
				llevada = 0;
			}
		}

		j = lonmax - lonmin - 1;
		while (j >= 0 && llevada == 1) {
			char cifra = mayor.charAt(j); 

			if (cifra == '9') {
				numllevo++;
			} else {
				llevada = 0; 
			}
			j--; 
		}
		System.out.println(numllevo);

		return true;
	}
}
