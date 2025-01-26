package avaliacao;
import java.util.Scanner;

public class questao_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int codigo, ano_nascimento, ano_ingresso, idade, tempo_contribuicao;
		
		System.out.print("Digite o seu código: ");
		codigo = sc.nextInt();
		
		System.out.print("Digite o ano do seu nascimento: ");
		ano_nascimento = sc.nextInt();
		
		System.out.print("Digite o ano de ingresso na empresa: ");
		ano_ingresso = sc.nextInt();
		
		idade = ano_nascimento - 2024;
		
		tempo_contribuicao = ano_nascimento - ano_ingresso;
		
		if(( idade >= 60) && (tempo_contribuicao >= 25)) {
			
			System.out.println("Requerer aposentadoria!");
		}else {
			System.out.println("Não requerer!");
		}
	}

}
