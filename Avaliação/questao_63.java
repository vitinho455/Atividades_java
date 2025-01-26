package avaliacao;

import java.util.Scanner;

public class questao_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int vet[] = new int[20], i, numero_aleatorio;
		boolean status = false;
		
		
		do {
		for(i = 0; i < 20; i++) {
		
			System.out.println("Digite o " + (i + 1) + "°" + " valor:");
			vet[i] = sc.nextInt();
			
		}
		
		System.out.println("Digite um número: ");
		numero_aleatorio = sc.nextInt();
		status = false;
		
		
		for(i = 0; i < 20; i++) {
			if(numero_aleatorio == vet[i]) {
				status = true;
				System.out.println("Este número está no vetor! Digite outro valor: ");
				break;
			}
		}
				
			
	}while(status == true);
	
		System.out.println("O número não foi encontrado no vetor. Programa encerrado! ");
		sc.close();
	}

}