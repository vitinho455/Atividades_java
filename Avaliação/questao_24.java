package avaliacao;
import java.util.Scanner;

public class questao_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int i,n, quantidade = 0;
		
		
		System.out.print("Digite a quantidade de valores que vão ser apresentados: ");
		n = sc.nextInt();
		
		int valor[] = new int[20];
		
		for(i = 0; i < n; i++) {
			
			System.out.print("Digite o " + (i + 1) + "° valor:");
			valor[i] = sc.nextInt();
			
		}
		
		System.out.println("--- Números maiores ou iguais a 5 ---");
		System.out.println();
		
		for(i = 0; i < n; i++) {
			if(valor[i] >= 5) {
				
				quantidade ++;
			}
			
		}
		
		System.out.println("Quantidade: " + quantidade);
		System.out.println("Números : " + valor[i]);
		
		sc.close();
		
	}

}
