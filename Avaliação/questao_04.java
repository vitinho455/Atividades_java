package avaliacao;
import java.util.Scanner;
public class questao_04 {

	public static void main(String[] args) {
		
		double celsius, fahrenheit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius");
		celsius = sc.nextDouble();
		
		fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
	}

}
