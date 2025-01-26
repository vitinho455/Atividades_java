package avaliacao;
import java.util.Scanner;

public class questao_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String combustivel;
		double gasolina = 3.30, alcool = 2.90, valor;
		int litros;
		
		System.out.println(" A- álcool ------ G- Gasolina ");
		
		System.out.println("Digite o tipo de conbustivel desejado (A/G): ");
		combustivel = sc.nextLine();
		
		System.out.println("Digite a quantidade de litro: ");
		litros = sc.nextInt();
		
		
		if(combustivel == "A") {
			
			valor = litros * alcool;
			System.out.println("Valor = R$ " + String.format("%.2f", valor));
		}
		else {
			valor = litros * gasolina;
			System.out.println("Valor = R$ " + String.format("%.2f", valor));
		}
		

	}

}
