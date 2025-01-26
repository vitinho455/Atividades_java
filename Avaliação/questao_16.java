package avaliacao;
import java.util.Scanner;

public class questao_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int i,n;
		
		System.out.println("Digite a quantidade de números que serão digitados: ");
		n = sc.nextInt();
		
		int num[] = new int[n];
		
		for(i = 0; i < n; i++) {
			
			System.out.println("Digite o " + (i + 1) + "° número :");
			num[i] = sc.nextInt();
			
		}
	
		
		System.out.print(" Números pares: ");
		
		
		for(i = 1; i < n; i++ ) {
			if(num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
			
			
		}
		
	}

}
