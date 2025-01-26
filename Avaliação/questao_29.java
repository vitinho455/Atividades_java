package avaliacao;

import java.util.Scanner;

public class questao_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		
		int area, lado;
		
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite o lado do " + (i + 1) + "° quadrado :" );
			lado = sc.nextInt();
			
			area = lado * lado;
			
			System.out.println("A área do " + (i  + 1) + "° quadrado é = " + area);
						
						
		    System.out.println();
			

			
		}
		
		
		
		sc.close();
		
	}

}
