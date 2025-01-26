import java.util.Scanner;

public class questao_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1, numero, soma = 0;

		System.out.println("Digite um número: ");
		numero = sc.nextInt();

		while (i <= numero) {
			System.out.print(i + " ");
			soma += i;
			i++;
		}

		System.out.println("\nSoma = " + soma);
		sc.close();
	}
}
