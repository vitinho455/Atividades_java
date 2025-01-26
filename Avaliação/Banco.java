package avaliacao;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int numero_conta, saldo, saldo_atual, debito, credito;
		
		System.out.print("Digite o número da sua conta: ");
		numero_conta = sc.nextInt();
		
		System.out.print("Digite o seu saldo atual: ");
		saldo = sc.nextInt();
		
		System.out.print("Digite o valor a ser debitado: ");
		debito = sc.nextInt();
		
		System.out.print("Digite o valor do crédito: ");
		credito = sc.nextInt();
		
		
		saldo_atual = saldo - (debito + credito);
		
		System.out.println(saldo_atual);
		
		if(saldo_atual > 0 ) {
			
			System.out.print(" Saldo Positivo! ");
		}
		else {
			
			System.out.print(" Saldo Negativo! ");
		}
		
		
		
	}

}
