package avaliacao;

import java.util.Scanner;

public class questao_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int linha, coluna;

		String posiciona[][] = new String[11][11];

		System.out.println("Digite a linha na qual você quer acessar: ");
		linha = sc.nextInt();

		System.out.println("Digite a coluna na qual você quer acessar: ");
		coluna = sc.nextInt();

		sc.nextLine();

		System.out.println("Digite uma mensagem : ");
		posiciona[linha][coluna] = sc.nextLine();

		System.out.println("Posição " + linha + "," + coluna + " está escrito: " + posiciona[linha][coluna]);

	}
}