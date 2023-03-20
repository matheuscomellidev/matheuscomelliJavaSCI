import java.util.Scanner;

public class DoisJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 5;
		int[] vetor = new int[n];
		int i;
		int maior;
		int menor;

		for (i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}

		maior = vetor[0];
		for (i = 1; i < n; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}

		for (i = 0; i < n; i++) {

		}

		menor = vetor[0];
		for (i = 1; i < n; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
			}

		}

		System.out.println("Maior valor: " + maior);
		System.out.println(("Manor valor: " + menor));

		
		sc.close();
	


	}

}
