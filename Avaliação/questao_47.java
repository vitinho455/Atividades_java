package avaliacao;

import java.util.Scanner;

public class questao_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int codigo, i, n, quantidade = 0;
		double preco[] = new double[15];
		double media, soma = 0, maior = 0;

		for (i = 0; i < 15; i++) {

			System.out.println("Digite o código do produto: ");
			codigo = sc.nextInt();

			System.out.println("Digite o valor do produto: ");
			preco[i] = sc.nextDouble();

			soma = soma + preco[i];
			quantidade++;
		}

		for (i = 0; i < 15; i++) {
			if (maior > preco[i]) {
				maior = preco[i];
				System.out.println("Maior preço = R$ " + String.format("%.2f", maior));
			}
		}

		media = soma / quantidade;

		System.out.println("Media = R$ " + String.format("%.2f", media));
	}

}
