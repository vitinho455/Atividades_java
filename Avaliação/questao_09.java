package avaliacao;
import java.util.Scanner;
public class questao_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_carros;
		double valor_carro, salario, comissao,salario_final, comissao_fixa, valor_vendas, percentual_vendas;
		
		
		System.out.print("Digite o número de carros vendidos:");
		num_carros = sc.nextInt();
		
		System.out.print("Digite o valor por carro vendido:");
		valor_carro = sc.nextDouble();
		
		System.out.print("Digite o seu salario:");
		salario = sc.nextDouble();
		
		System.out.print("Digite a sua comissão:");
		comissao = sc.nextDouble();
		
		comissao_fixa = comissao * valor_carro *num_carros;
		valor_vendas = valor_carro * num_carros;
		percentual_vendas = valor_vendas * 0.05;
		salario_final = salario + comissao_fixa+ percentual_vendas;

		
		System.out.println("O seu salário final é: " + String.format("%.4f", salario_final));
	}

}
