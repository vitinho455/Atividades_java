package avaliacao;
import java.util.Scanner;

public class questao_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String nome;
		int quantidade;
		double preco_unitario, total, total_pagar;
		
		System.out.println("Insira o nome do produto: ");
		nome = sc.nextLine();
		
		System.out.println("Insira a quantidade: ");
		quantidade = sc.nextInt();
		
		System.out.println("Insira o preço do produto: ");
		preco_unitario = sc.nextDouble();
		
		total = preco_unitario * quantidade;
		
		if(quantidade <= 5) {
			
			total_pagar = total - (total * 0.02);
			System.out.println("Total a pagar = R$ " + String.format("%.2f", total_pagar));
			
		}else if((quantidade > 5) && (quantidade <= 10)) {
			
			total_pagar = total - (total * 0.03);
			System.out.println("Total a pagar = R$ " + String.format("%.2f", total_pagar));
			
		}else if(quantidade > 10) {
			
			total_pagar = total - (total * 0.05);
			System.out.println("Total a pagar = R$ " + String.format("%.2f", total_pagar));
		}
		
	}
	
}