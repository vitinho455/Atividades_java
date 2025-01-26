package avaliacao;

import java.util.Scanner;

public class questao_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int v1[] = new int[5];
		int v2[] = new int[5];
		int quantidade = 0, i;

		System.out.println("Valores de V1");
		
		for (i = 0; i < 5; i++) {

			System.out.println("Digite o " + (i + 1) + "°" + " valor de V1: ");
			v1[i] = sc.nextInt();

		}
		
		System.out.println("Valores de V2");

		for (i = 0; i < 5; i++) {

			System.out.println("Digite o " + (i + 1) + "°" + " valor de V2: ");
			v2[i] = sc.nextInt();

		}

		for (i = 0; i < 5; i++) {
			if (v1[i] == v2[i]) {
				quantidade++;
			}
			

		}
		System.out.println("Quantidade de números que possuem o mesmo numero = " + quantidade);
		sc.close();
	}

}
