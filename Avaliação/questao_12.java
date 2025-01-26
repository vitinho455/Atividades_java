package avaliacao;
import java.util.Scanner;

public class questao_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int quantidade_atual, quantidade_maxima, quantidade_minima, media;
		
		System.out.println("Digite a quantidade atual de produtos no estoque: ");
		quantidade_atual = sc.nextInt();
		
		System.out.println("Digite a quantidade máxima de produtos no estoque: ");
		quantidade_maxima = sc.nextInt();
		
		System.out.println("Digite a quantidade minima de produtos no estoque: ");
		quantidade_minima = sc.nextInt();
		
		media = (quantidade_maxima + quantidade_minima) / 2;
		
		System.out.println(" Quantidade media: " + media);
		
		if(quantidade_atual >= media) {
			
			System.out.println(" Não efetuar compra! ");
			
		}
		else {
			System.out.println(" Efetuar compra! ");
		}
		
		
		
	}

}
