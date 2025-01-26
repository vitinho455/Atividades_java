package avaliacao;

import java.util.Scanner;

public class questao_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int media_filhos, num_filhos, qtde_salario = 0, qtde_filhos = 0, i, m = 0, soma_filhos = 0;
		double percentual = 0, media_salario, maior = 0, soma_salario = 0;

		System.out.println("Digite a quantidade de habitantes da cidade: ");
		m = sc.nextInt();

		int numero_filho[] = new int[m];
		double salario[] = new double[m];

		for (i = 0; i < m; i++) {

			System.out.println("Digite o salário: ");
			salario[i] = sc.nextDouble();
			qtde_salario++;
			soma_salario = soma_salario + salario[i];

			System.out.println("Digite a quantidade de filhos: ");
			numero_filho[i] = sc.nextInt();
			qtde_filhos++;
			soma_filhos = soma_filhos + numero_filho[i];
		}

		media_salario = soma_salario / qtde_salario;
		media_filhos = soma_filhos / qtde_filhos;

		System.out.println("Media de salário da população = R$" + String.format("%.2f", media_salario));
		System.out.println("Media de filhos da população = " + media_filhos);

		for (i = 0; i < m; i++) {
			if (maior > salario[i]) {
				maior = salario[i];
				System.out.println("Maior salário dos habitantes = R$" + String.format("%.2f", maior));
			}

		}
		for (i = 0; i < m; i++) {
			if (salario[i] < 150.00) {
				percentual++;
			}
			percentual = (percentual / m) * 100;
		}
		System.out.println("Percentual de pessoas com salário abaixo de R$ 150,00 = " + String.format("%.2f", percentual) + "%");
		sc.close();
	}
}
