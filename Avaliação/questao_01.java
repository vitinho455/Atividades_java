package avaliacao;
import java.util.Scanner;
public class questao_01 {

	public static void main(String[] args) {

		double salario,salario_novo,percentual, valor_de_aumento;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salário: ");
		salario = sc.nextDouble();
		System.out.print("Digite o percentual de aumento que você vai receber: ");
		percentual = sc.nextDouble();
		
		System.out.println();
		
		valor_de_aumento = salario * percentual;
		salario_novo = salario + valor_de_aumento;
		
		System.out.println("O seu novo salário é:" + String.format("%.3f",salario_novo));
		
		System.out.println("Valor do aumento: " + String.format("%.3f",valor_de_aumento));
		
		
	}

}
