package avaliacao;

import java.util.Scanner;

public class questao_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int i,n,soma = 0,quantidade = 0;
		
		
		System.out.print("Digite a quantidade de números que serão digitados:");
		n = sc.nextInt();
		
		int num[] = new int[n];
		
		for(i = 0; i < n; i++) {
			
			System.out.print("Digite o valor do " + (i + 1) + "° número: ");
			num[i] = sc.nextInt();
			
			
		}
		
		for(i = 0; i < n; i++) {
			if(num[i] > 0) {
				soma = soma + num[i];
				quantidade ++;
			}
			
		}
	
	System.out.println("Media = " + (soma / quantidade));
	}

}
