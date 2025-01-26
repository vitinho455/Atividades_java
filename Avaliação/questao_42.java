package avaliacao;

import java.util.Scanner;

public class questao_42 {

	//42 --- 43
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		double valor_mercadoria,valor_total, media, soma = 0;
		int total_mercadoria, i;
				
		System.out.print("Digite a quantidade de mercadoria no estoque: ");
		total_mercadoria = sc.nextInt();		
		
		for(i = 0; i < total_mercadoria; i++) {
		
			System.out.print("Digite o valor de cada mercadoria: ");
			valor_mercadoria = sc.nextDouble();
			
			soma = soma  + valor_mercadoria;
		}	
		
		media = soma / total_mercadoria;
		
		System.out.println("Total em estoque = " + total_mercadoria);
		System.out.println("Valor total da mercadoria = " + String.format("%.2f", soma));
		System.out.println("Media = " + String.format("%.2f", media));
	
		
		sc.close();
	}

}
