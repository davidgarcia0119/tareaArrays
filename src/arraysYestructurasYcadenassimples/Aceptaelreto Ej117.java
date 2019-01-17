package arraysYestructurasYcadenassimples;

import java.util.Scanner;
//Daniel Vera
public class Ej117 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int casos;
		casos = s.nextInt();
		String sobrante;
		String nombre;
		for (int i = 1; i <= casos; i++) {
			sobrante = s.next();
			nombre = s.next();
			String replacedStr = sobrante.replaceAll("Soy", "Hola, ");
			System.out.println(replacedStr + nombre + ".");
		}
	}
}