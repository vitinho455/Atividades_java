package avaliacao;

import java.util.Scanner;

public class questao_65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int vet[] = new int [30], i,numero_aleatorio, quantidade = 0;
		
		for(i = 0; i < 30; i++) {
			
			System.out.print("Digite o " + (i + 1) + "°" + " valor: ");
			vet[i] = sc.nextInt();
			
		}
		
		System.out.print("Digite um número: ");
		numero_aleatorio = sc.nextInt();
	
		
			for(i = 0; i < 30; i++) {
				if(numero_aleatorio == vet[i]) {
					
					quantidade ++;
				}
			
			
		}
			System.out.println("O número " + numero_aleatorio + " aparece " + quantidade + " vezes!");
		
	}

}
