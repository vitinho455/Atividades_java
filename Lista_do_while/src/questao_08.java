package lista_do_while;
import java.util.Scanner;


public class questao_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int soma = 0, numero;
		
		
		
		for(int i = 1; i <= 10; i++) {
		
			System.out.println("Digite o " + i + "° nota: ");
			numero = sc.nextInt();
			
			soma += numero;
			
		}
		
			System.out.println("Soma = " + soma);
			sc.close();
	}

		
	
}
