import java.util.Scanner;

public class questao_09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, soma = 0, i = 1;

		while (i <= 10) {
			System.out.println("Digite o " + i + "° nota: ");
			numero = sc.nextInt();

			if (numero < 40) {
				soma += numero;
			}

			i++;
		}

		System.out.println("Soma = " + soma);
		sc.close();
	}
}
