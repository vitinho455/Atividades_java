package avaliacao;
import java.util.Scanner;

public class questao_03 {

	public static void main(String[] args) {
		
		int ano_atual,ano_de_nascimento, ano_individuo ;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o ano atual: ");
		ano_atual = sc.nextInt();
		System.out.print("Digite o ano que você nasceu: ");
		ano_de_nascimento = sc.nextInt();
		
		ano_individuo = ano_atual - ano_de_nascimento;
		
		if(ano_individuo >= 16) {
			System.out.println("O indivíduo já pode votar!");
		}
		else {
			System.out.println("O indivíduo não pode votar!");
		}
		
	}

}
