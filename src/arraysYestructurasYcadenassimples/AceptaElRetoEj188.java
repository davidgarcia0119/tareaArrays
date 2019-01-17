package arraysYestructurasYcadenassimples;

import java.util.Scanner;

public class Ej188 {
//David Garcia
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String texto;
		String palabrasdivididas[];
		String solucion;
		String palabraactual;
		String palabrasiguiente;
		String principio;
		String fin;

	
		while (sc.hasNextLine()) {
			solucion = "SI";
			texto = sc.nextLine();
			palabrasdivididas = texto.split(" ");

			for (int i = 0; i < palabrasdivididas.length - 1; i++) {
				palabraactual = palabrasdivididas[i];
				palabrasiguiente = palabrasdivididas[i + 1];

				// conesuigmos las dos ultimas de palabraactual
				fin = palabraactual.substring(palabraactual.length() - 2, palabraactual.length());
				principio = palabrasiguiente.substring(0, 2);

				if (!fin.equals(principio)) {

					solucion = "NO";
				}

			}
				System.out.println(solucion);

		}

	}

}
