import java.util.Scanner;

public class QuatroJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[5];
		int i;

		for (i = 0; i < 5; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}

		System.out.println("Número na posição três é: " + vetor[3]);

		sc.close();

	}

}
