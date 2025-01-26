package avaliacao;

import java.util.Scanner;

public class questao_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
	
		int i,n,quantidade = 0, soma = 0;
		
		System.out.print("Digite a quantidade de números que serão digitados: ");
		n = sc.nextInt();
		
		int num[] = new int[n];
		
		for(i = 0; i < n; i++ ) {
			
			System.out.print("Digite o " + (i + 1) + "° número :");
			num[i] = sc.nextInt();
			quantidade++;
			soma = soma + num[i];
		    
		}
		
		System.out.println("Media = " + (soma / quantidade));
		
		
	}

}
