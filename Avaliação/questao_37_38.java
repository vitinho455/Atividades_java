package avaliacao;
import java.util.Scanner;

public class questao_37_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int nota1,nota2,media;
		String novo_calculo;		
		
		do {
			

			System.out.print("Insira a sua nota da primeira avaliação: ");
			nota1 = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Insira a sua nota da segunda avaliação: ");
			nota2 = sc.nextInt();
			sc.nextLine();

			media = (nota1 + nota2) / 2;
			
			System.out.println("Media = " + media);
			System.out.println();
			
			
			System.out.print("Novo cálculo? (S/N)?");
			novo_calculo = sc.nextLine();
			
			
			
		}while(novo_calculo.toLowerCase().equals("s"));
		
		sc.close();
		}
	}



