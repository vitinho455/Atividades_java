package lista_do_while;

import java.util.Scanner;

public class questao_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int i,numero, soma = 0;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		for(i = 1; i <= numero; i++) {
			
			System.out.print(i + " ");
			soma += i;
			
		}
				
		System.out.println("Soma = " + soma);
		
	}
	

}
