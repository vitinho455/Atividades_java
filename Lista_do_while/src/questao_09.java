package lista_do_while;

import java.util.Scanner;

public class questao_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int numero, soma = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println("Digite o " + i + "° nota: ");
			numero = sc.nextInt();
			
			if(numero < 40) {
				
				soma += numero;
				
			}
			
		}
		
		System.out.println("Soma = " + soma);
		
	}

}
