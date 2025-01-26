package avaliacao;
import java.util.Scanner;
public class questao_05 {

	public static void main(String[] args) {
		
		char vogal,consoante,letra;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
		letra = sc.next().charAt(0);
		
		if( (letra == 'a') || (letra == 'e') ||(letra == 'i') || (letra == 'o') || (letra == 'u')) {
			
			System.out.println("É consoante");
		}
		else {
			System.out.println("Não é consoante!");
		}

		sc.close();
	}

}
