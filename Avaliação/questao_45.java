package avaliacao;

import java.util.Scanner;

public class questao_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);

		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		String hexadecimal = Integer.toHexString(numero);
		
		System.out.println("Representação em Hexadecimal = " + hexadecimal);
		
		
	}

}
