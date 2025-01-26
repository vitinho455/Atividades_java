package avaliacao;

import java.util.Scanner;

public class questao_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int i,n, soma = 0, quantidade = 0, media = 0;
		
		
		for(i = 15; i < 100; i++) {
			
			soma += i;
			quantidade++;
			media = soma / quantidade;
		}
		
		
		System.out.println("Media = " + media);
		
		
	}

}
