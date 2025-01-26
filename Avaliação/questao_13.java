package avaliacao;
import java.util.Scanner;
public class questao_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c, soma;
		
		System.out.print("Digite o valor do lado A: ");
		a = sc.nextInt();
		System.out.print("Digite o valor do lado B: ");
		b = sc.nextInt();
		System.out.print("Digite o valor do lado C: ");
		c = sc.nextInt();
	
		soma = a + b + c;
		
		System.out.println("Soma dos lados = " + soma);
		
		if((a + b) > c && ((a+c) > b) && ((b+c) > a)){
			
			System.out.print("O triangulo se forma!");
		}
		else {
			System.out.print("O triangulo não se forma!");
		}
	}

}
