package avaliacao;

import java.util.Scanner;

public class estrutura_repita {

	public static void main(String[] args) {

		int valor1, valor2, divisao;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor:");
		valor1 = sc.nextInt();

		System.out.print("Digite o segundo valor:");
		valor2 = sc.nextInt();

		do {

			System.out.print("Valor inválido! Tente novamente: ");
			valor2 = sc.nextInt();

		} while (valor2 == 0);

		System.out.println("Resultado = " + ((valor1 + valor2) / 2));

	}

}
