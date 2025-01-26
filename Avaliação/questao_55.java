package avaliacao;
import java.util.Scanner;


public class questao_55 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int q[] = new int[20], i, maior = 0, posicao = 0;

		
		for(i = 0 ; i < 20; i++) {
			
			System.out.print("Digite o valor: ");
			q[i] = sc.nextInt();
			
			
		}
		sc.close();
		
		for(i = 0 ; i < 20; i++) {
			if(q[i] > maior) {
				maior = q[i];
				posicao = i;
	
			}
	
		
		}
		System.out.println("Número = " + maior);
		System.out.println("Posição = " + posicao);
	}

}
