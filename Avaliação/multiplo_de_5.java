package avaliacao;
import java.util.Scanner;
public class multiplo_de_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		if(numero % 5 == 0) {
			
			System.out.println("Este número é divisível por 5!");
			
			
		}
		else {
			System.out.println("Este número não é Divisível por 5!");
		}
		
		sc.close();
		
	}

}
