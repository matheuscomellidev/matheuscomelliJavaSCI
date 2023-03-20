import java.util.Scanner;

public class TresJava {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String nome;
	double nota01;
	double nota02;
	double nota03;
	double nota04;
	double media;
	String inserir;

	System.out.println("Deseja inserir novos dados? ");
	System.out.println("s - SIM/ n - NÃO");
	inserir = sc.next();
	
	while (inserir.equals("s") ) {

		System.out.print("Nome do aluno: ");
		nome = sc.next();
		System.out.print("Primeira nota: ");
		nota01 = sc.nextDouble();
		System.out.print("Segunda nota: ");
		nota02 = sc.nextDouble();
		System.out.print("Terceira nota: ");
		nota03 = sc.nextDouble();
		System.out.print("Quarta nota: ");
		nota04 = sc.nextDouble();

		media = (nota01 + nota02 + nota03 + nota04) / 4;

		System.out.println("Média final: " + media);

		if (media < 6) {
			System.out.println("REPROVADO");
		} else {
			System.out.println("APROVADO");
		}
		System.out.println("--------------------");

		System.out.println("Deseja inserir novos dados? ");
		System.out.println("1 - SIM/ 2- NÃO");
		inserir = sc.next();
	}

		sc.close();

}

}
