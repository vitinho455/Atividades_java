package avaliacao;

import java.util.Scanner;

public class questao_61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int vet[] = new int[10], i;
		
		for(i = 0; i < 10; i++) {
			
			System.out.println("Digite o " + (i + 1) + "°" + " valor:");
			vet[i] = sc.nextInt();
			
		}
		
		System.out.println("Resultado crescente: ");
		
		for(i = 9; i >= 0; i--) {
			
			System.out.println(vet[i] + " ");
			
		}
		sc.close();
		
	}

}
