package avaliacao;

import java.util.Scanner;

public class questao_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int vet[] = new int [5], i;
		
		for(i = 0; i < 5; i++) {
			
			System.out.println("Digite o " + (i + 1) + "°" + " valor:");
			vet[i] = sc.nextInt();
			
		}
		
		System.out.println("Resultado invertido: ");
		
		for(i = 4; i >= 0; i--) {
			
			System.out.print(vet[i] + " ");
			
		}
		sc.close();
	}

}
