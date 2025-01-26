package avaliacao;
import java.util.Scanner;
public class questao_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		double preco_original, preco_final, desconto, valor_descontado;
		
		System.out.print("Digite o preço do produto: ");
		preco_original = sc.nextDouble();
		System.out.print("Digite o desconto: ");
		desconto = sc.nextDouble();
		
		preco_final = preco_original - (preco_original * desconto);
		valor_descontado = preco_original * desconto;
		
		System.out.println("Desconto = " + desconto + "%");
		System.out.println("Valor descontado = R$ " + String.format("%.2f", valor_descontado));
		System.out.println("Total a pagar = R$ " + String.format("%.2f", preco_final));
	}

}
