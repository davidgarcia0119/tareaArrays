package arrays;

import java.util.Arrays;
import java.util.Scanner;

//Daniel Vera
public class Ej161 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int casos = 1;
		int suma = 0;
		while (casos != 0) {
			casos = s.nextInt();
			int[] numeros = new int[casos];
			if (casos != 0) {
				for (int i = 0; i < casos; i++) {
					int numPos = s.nextInt();
					numeros[i] = numPos;
				}
				Arrays.sort(numeros);
				if (casos % 2 == 0) {
					suma = numeros[casos / 2] + numeros[(casos / 2) - 1];
					System.out.println(suma);
				} else {
					suma = numeros[(int) ((casos / 2) + 0.5)] * 2;
					System.out.println(suma);
				}
			}
		}
	}
}