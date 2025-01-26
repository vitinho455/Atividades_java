package avaliacao;
import java.util.Scanner;
public class questao_06 {

	public static void main(String[] args) {
		
		double valor_refeicao,taxa,valor_total;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite o valor da refeição: ");
		valor_refeicao = sc.nextDouble();
		
		System.out.print("Digite a taxa cobrada: ");
		taxa = sc.nextDouble();
		
		valor_total = valor_refeicao * taxa;
		
		System.out.println("Valor a ser pago: " + String.format("%.4f", valor_total));

	}

}
