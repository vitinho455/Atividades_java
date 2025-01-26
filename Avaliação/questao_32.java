package avaliacao;

import java.util.Scanner;

public class questao_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);

		int a = 1;
		int b = 0;
		int ant,n;
		
		
		
		System.out.println("Quantos valores vão aparecer na sequência: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.print(a + " ");
			ant = a; // armazena o valor atual de a no anterior
			a = a+b;//atualiza o valor a para a soma de 
			b = ant;//atualiza o valor de B para o valor anterior de a armazenado na variável ant
		}
	sc.close();
	}

}
