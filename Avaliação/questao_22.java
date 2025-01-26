package avaliacao;
import java.util.Scanner;

public class questao_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, media_exercicio = 6.0, media_de_aproveitamento;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
	
		
		media_de_aproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + media_exercicio) / 6;
		
		System.out.println("Media = " + String.format("%.2f", media_de_aproveitamento));
		
		if(media_de_aproveitamento >= 9.0) {
			
			System.out.println("Conceito = A");
			
		}else if((media_de_aproveitamento >= 7.5) && (media_de_aproveitamento < 9.0)) {
			
			System.out.println("Conceito = B");
		}else if((media_de_aproveitamento >= 6.0) && (media_de_aproveitamento < 7.5)) {
			
			System.out.println("Conceito = C");
		}else if(media_de_aproveitamento < 6.0) {
			
			System.out.println("Conceito = D");
		}
	}

}
