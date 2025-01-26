package avaliacao;

import java.util.Scanner;

public class questao_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i;
		int A[] = new int[10];
		int X;
		int M[] = new int[10];

		for (i = 0; i < 10; i++) {

			System.out.print("Digite o " + (i + 1) + "°" + " valor de A:");
			A[i] = sc.nextInt();
		}

		System.out.print("Digite o valor de X:");
		X = sc.nextInt();
		for (i = 0; i < 10; i++) {
			M[i] = X * A[i];
		}

		System.out.println("Resultado: ");

		for(i = 0; i < 10; i++) {
			System.out.print(M[i] + " ");
		}
		
	}

}
