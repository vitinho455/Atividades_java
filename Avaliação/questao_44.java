package avaliacao;

import java.util.Scanner;

public class questao_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		
		int maior = 0,menor = 0, i = 0;
		
		int num[] = new int[100];
		
		
		
		
		for(i = 0; i < 100; i++) {
			if(num[i] > maior) {
				
				maior = num[i];
			}
			
		}
		
		for(i = 0; i < 100; i++) {
			if(num[i] < 0) {
				
				menor = num[i];
				
			}
			
		}
		
		System.out.println("Maior número = " + maior);
		System.out.println("Menor número = " + menor);
	}

}
