package avaliacao;

import java.util.Scanner;

public class questao_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = 0,numero;
		
		System.out.print("Digite o número que você quer saber a tabuada: ");
		numero = sc.nextInt();
		
		
		for(i = 0 + 1; i < 10 + 1; i++) {
			
			System.out.println(numero + " x " + i + " : " + numero * i  );
		    
		}
		
		
	}

}
