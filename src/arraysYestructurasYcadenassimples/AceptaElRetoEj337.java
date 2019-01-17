package arraysYestructurasYcadenassimples;

import java.util.Scanner;

public class Ej337 {
	public static void main(String[] args) {

		// Codigo de Jorge de Paz.

		Scanner in1 = new Scanner(System.in);
		int nCasos = in1.nextInt();
		boolean encajan = false;
		in1.nextLine();
		while (nCasos > 0) {
			int suma = 0;
			int[] DienteAr = new int[6];
			int[] DienteAb = new int[6];
			for (int i = 0; i < DienteAr.length; i++) {
				DienteAr[i] = in1.nextInt();
			}
			for (int i = 0; i < DienteAb.length; i++) {
				DienteAb[i] = in1.nextInt();
			}
			suma = DienteAr[0] + DienteAb[0];
			for (int i = DienteAb.length - 1; i > 0; i--) {
				if (DienteAr[i] + DienteAb[i] == suma) {
					encajan = true;
				} else {
					encajan = false;
					i = 0;
				}
			}
			nCasos--;
			if (encajan == true) {
				System.out.println("SI");
			} else
				System.out.println("NO");
		}
	}
}
