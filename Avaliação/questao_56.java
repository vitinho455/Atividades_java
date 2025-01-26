package avaliacao;

import java.util.Scanner;

public class questao_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int q[] = new int[20], i, menor, posicao;

		
		for(i = 0 ; i < 20; i++) {
			
			System.out.print("Digite o valor: ");
			q[i] = sc.nextInt();
			
			
		}
		sc.close();
		
		menor = q[0];
		posicao = 0;
		
		
		for(i = 0 ; i < 20; i++) {
			if(q[i] < menor) {
				menor = q[i];
				posicao = i;
	
			}
	
		
		}
		System.out.println("Número = " + menor);
		System.out.println("Posição = " + posicao);
	}

}
