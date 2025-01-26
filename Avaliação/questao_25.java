package avaliacao;

import java.util.Scanner;

public class questao_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int i,n;
		
		System.out.print("Digite a quantidade de números que serão digitados: ");
		n = sc.nextInt();
		
		int neg[] = new int[n];
		
		for(i = 0; i < n; i++ ) {
			
			System.out.print("Digite o " + (i + 1) + "° número :");
			neg[i] = sc.nextInt();
			
		}
	
		
		System.out.println("---- Números negativos ---- ");
		
		
		for(i = 1; i < n; i++ ) {
			if(neg[i] < 0 ) {
				System.out.println(neg[i]);
			}
			
			
		}
		
		
		
		
		
	}

}
