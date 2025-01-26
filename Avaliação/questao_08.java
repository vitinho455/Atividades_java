package avaliacao;
import java.util.Scanner;
public class questao_08 {

	public static void main(String[] args) {
		
		double custo_fabrica, custo_final;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do custo de fábrica: ");
		custo_fabrica = sc.nextDouble();
		
		
		custo_final = custo_fabrica + (custo_fabrica * 0.28) + (custo_fabrica * 0.45);
		
		
		System.out.println("O valor final para o consumidor é: " + String.format("R$ %.2f\n", custo_final));
	}

}
