package avaliacao;

import java.util.Scanner;

public class questao_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
		char letra = sc.next().charAt(0);
		
		if(Character.isUpperCase(letra)) {
			
			System.out.println("É maiúscula!");
			
		}else {
			
			System.out.println("É minúscula!");
		}
		sc.close();
	}

}
