package avaliacao;

import java.util.Scanner;

public class Cem_valores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        
		int menor,maior = 0, i = 0,n;
		
		System.out.println("Digite a quantidade de valores: ");
		n = sc.nextInt();
		
		int num[] = new int[n];
		
		for(i = 0; i < n; i++) {
		
			System.out.print("Digite o valor: ");
			num[i] = sc.nextInt();
			
		}
		
		for(i = 0; i < n; i++) {
			if(maior < num[i]) {
				maior = num[i];
			}
		}
		System.out.println("Maior = " + maior);

		menor = maior;
		
		for(i = 0; i < n; i++) {
			 if(menor > num[i]) {
			        menor = num[i];
			   }
		}
		System.out.println("Menor = " + menor);
		
	}

}
