package arraysYestructurasYcadenassimples;
//Carlos Rey Gonzalez

public class Ej263 {
	static java.util.Scanner s;

	public static String[][] rellenarray(int n, String[][] arry) {

		String total;

		for (int i = 0; i < n; i++) {
			total = s.next();
			for (int j = 0; j < n; j++) {
				arry[i][j] = ("" + total.charAt(j));
			}
		}
		return arry;
	}

	public static String[][] desp(String[][] arry) {
		String CF = s.next();
		int fc;
		while (!CF.equals("x")) {
			if (CF.equals("f")) {
				fc = s.nextInt();
				arry = despF(arry, fc);
			} else {
				fc = s.nextInt();
				arry = despC(arry, fc);
			}
			CF = s.next();
		}
		return arry;
	}

	public static String[][] despF(String[][] matriz, int valor) {
		String aux;
		if (valor > 0) {
			aux = matriz[valor - 1][matriz.length - 1];
			for (int j = matriz.length - 1; j > 0; j--) {
				matriz[valor - 1][j] = matriz[valor - 1][j - 1];
			}
			matriz[valor - 1][0] = aux;
		} else {
			valor *= -1;
			aux = matriz[valor - 1][0];
			for (int j = 0; j < matriz.length - 1; j++) {

				matriz[valor - 1][j] = matriz[valor - 1][j + 1];
			}
			matriz[valor - 1][matriz.length - 1] = aux;
		}
		return matriz;
	}

	public static String[][] despC(String[][] matriz, int valor) {
		String aux;
		if (valor > 0) {
			aux = matriz[matriz.length - 1][valor - 1];
			for (int j = matriz.length - 1; j > 0; j--) {
				matriz[j][valor - 1] = matriz[j - 1][valor - 1];
			}
			matriz[0][valor - 1] = aux;
		} else {
			valor *= -1;
			aux = matriz[0][valor - 1];
			for (int j = 0; j < matriz.length - 1; j++) {
				matriz[j][valor - 1] = matriz[j + 1][valor - 1];
			}
			matriz[matriz.length - 1][valor - 1] = aux;
		}
		return matriz;
	}

	public static void imprimir(String[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		System.out.println("---");
	}
	
	public static void main(String[] args) {
		s = new java.util.Scanner(System.in);
		int tamano = s.nextInt();
		String[][] matriz;
		while (tamano != 0) {
			matriz = new String[tamano][tamano];
			matriz = rellenarray(tamano, matriz);
			matriz = desp(matriz);
			imprimir(matriz);
			tamano = s.nextInt();
		}
	}
}
