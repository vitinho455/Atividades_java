package avaliacao;

import java.util.Scanner;

public class questao_34 {

	public static void main(String[] args) {
		int valor1, valor2, divisao;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor:");
		valor1 = sc.nextInt();

		System.out.print("Digite o segundo valor:");
		valor2 = sc.nextInt();
		
		while(valor2 == 0) {
			
			System.out.print("VALOR INVÁLIDO! TENTE NOVAMENTE: ");
			valor2 = sc.nextInt();
		}
		
		System.out.println("Resultado = " + ((valor1 + valor2) / 2));
		
	}

}
