
import java.util.Scanner;

public class questao_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int soma = 0, numero, i = 1;

		while (i <= 10) {
			System.out.println("Digite o " + i + "° nota: ");
			numero = sc.nextInt();
			soma += numero;
			i++;
		}

		System.out.println("Soma = " + soma);
		sc.close();
	}
}
