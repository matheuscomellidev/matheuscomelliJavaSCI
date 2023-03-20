import java.util.Scanner;

public class CincoJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[3];
		double[][] notas = new double[3][4];
		double[] medias = new double[3];
		double soma;
		// String i;

		System.out.print("Nome: ");
		for (int i = 0; i < 3; i++) {
			nomes[i] = sc.next();
		}

		System.out.println("Informe a Nota");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				notas[i][j] = sc.nextDouble();
			}
		}

		System.out.println("Notas");
		for (int i = 0; i < notas.length; i++) {
			soma = 0;
			for (int j = 0; notas[i].length < 4; j++) {
				notas[i][j] = sc.nextDouble();
				soma += notas[i][j];
				for(i = 0; i < 3; i++) {
					System.out.println(nomes[i]);
				}

			}

			
			
			
		}

		sc.close();
	}
}
