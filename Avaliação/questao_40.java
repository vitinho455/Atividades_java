package avaliacao;

import java.util.Scanner;

public class questao_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);

		int valor1,valor2, soma = 0;
		
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = sc.nextInt();
	
	
		System.out.println("Digite o segundo valor: ");
		valor2 = sc.nextInt();
	
		
		for(int i = valor1; i <= valor2; i++) {
			soma += i;
		}
		
		System.out.println("Soma = " + soma);
		
	
	//questão a ser abordada com o professor
		
		
	}

}
