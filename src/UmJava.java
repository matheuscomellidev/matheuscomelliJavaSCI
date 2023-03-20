import java.util.Scanner;

public class UmJava {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int n = 5;
			int[] vetor = new int[n];
			int somaP = 0;
			int somaI = 0;
			double media;

			for (int i = 0; i < n; i++) {
				System.out.print("Informe um número: ");
				vetor[i] = sc.nextInt();
			}

			System.out.println("-----------------------");
			System.out.println("Números pares:");

			for (int i = 0; i < n; i++) {
				if (vetor[i] % 2 == 0) {
					vetor[i] = vetor[i];
					somaP = somaP + vetor[i];
					System.out.println(vetor[i]);
				}

			}

			System.out.println("Números ímpares: ");

			for (int i = 0; i < n; i++) {
				if (vetor[i] % 2 == 1) {
					vetor[i] = vetor[i];
					somaI = somaI + vetor[i];
					System.out.println(vetor[i]);
				}

			}

			media = (somaP + somaI) / (double) n;
			System.out.println("Média geral: " + media);

			sc.close();
		}

	}


