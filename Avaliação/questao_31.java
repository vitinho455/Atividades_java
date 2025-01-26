package avaliacao;

import java.util.Scanner;

public class questao_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i,n, numero, fatorial = 1;
		
		
		
		System.out.print("Digite o número na qual deseja saber o fatorial:");
		numero = sc.nextInt();
		
		System.out.print(numero + "!= ");
		
		for(i = numero; i > 1 ; i--) {
			System.out.print(i + " * ");
			fatorial *= i;
			
		}
		
		System.out.print("1 = " + fatorial);
		
	}

}
