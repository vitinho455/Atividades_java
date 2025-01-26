import java.util.Scanner;

public class questao_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroAluno, contador = 0;
		double media = 0, nota;

		System.out.println("Digite a quantidade de alunos: ");
		numeroAluno = sc.nextInt();


		while (contador < numeroAluno) {
			System.out.println("Digite a " + (contador + 1) + "° nota: ");
			nota = sc.nextDouble();
			media += nota;
			contador++;
		}


		media /= numeroAluno;

		System.out.printf("Média de notas = %.2f", media);
		sc.close();
	}
}
