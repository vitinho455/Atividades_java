# Atividades_java
Atividade para fins acadêmicos.

package lista_extra;

public class questao_49 {

	public static void main(String[] args) {
		String palavra = "javaprog";
		
		if (palavra.startsWith("java")) {
			System.out.println("Sua string começa com a palavra java!");
		}else {
			System.out.println("Sua string não começa com a palavra java!");
		}
		
	}
}


package lista_extra;

public class questao_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palavra = "aprendendo programação";
		
		if (palavra.endsWith("programação")) {
			System.out.println("Sua string termina com a palavra programação!");
		}else {
			System.out.println("Sua string não termina com a palavra programação!");
		}
		
	}
		
	}


package lista_extra;

import java.util.ArrayList;
import java.util.Scanner;

public class questao_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> Nomes = new ArrayList<String>();
		
		System.out.println("Digite a quantidade de nomes que vão ser digitdos: ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < quantidade; i++) {
			
			System.out.println("Digite o " +(i + 1) +"° nome");
			String nome = sc.nextLine();
			Nomes.add(nome);
			
		}
		
		System.out.println("Nomes digitados: " + Nomes);	
		
		/*
		Nomes.add("João");
		Nomes.add("Maria");
		Nomes.add("José");
		Nomes.add("Ana");
		Nomes.add("Carlos");
		
		System.out.print("Nomes = " + Nomes);
		*/
	}

}
package lista_extra;

import java.util.Scanner;

public class questao_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		int numero[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Digite o " +(i+1)+ "° número: ");
			numero[i] = sc.nextInt();
			soma += numero[i];
			
		}
		
			System.out.print("Soma = " + soma);
	}

}
package lista_extra;

import java.util.ArrayList;
import java.util.Scanner;

public class questao_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma = 0;
		double media = 0;
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> Numeros = new ArrayList<Integer>();
		
		System.out.println("Digite a quantidade de elementos no seu ArrayList: ");
		int quantidade  = sc.nextInt();
		
		for (int i = 0; i < quantidade; i++) {
			
			System.out.println("Digite o " +(i+1)+ "° número:");
			int numero = sc.nextInt();
			Numeros.add(numero);
			soma += numero; 
			media += quantidade;
		}
		media /= soma;
		
		System.out.println("Media = "  + String.format("%.2f", media));
		
	}

}
package lista_extra;

import java.util.Arrays;
import java.util.Scanner;

public class questao_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int quantidade;

		System.out.println("Digite a quantidade de elementos do seu array: ");
		quantidade = sc.nextInt();

		int numero[] = new int[quantidade];

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Digite o " + (i + 1) + "° número:");
			numero[i] = sc.nextInt();

		}

		System.out.println("Deseja alterar algum número do seu Array?(true/false) ");
		boolean decisao = sc.nextBoolean();

		if (decisao == true) {

			System.out.println("Digite o indice que vai ser modificado: ");
			int indice = sc.nextInt();

			System.out.println("Digite um novo valor: ");
			int novoValor = sc.nextInt();

			numero[indice] = novoValor;

			System.out.println("Lista atualizada: " + Arrays.toString(numero));
		} else {
				System.out.println("Números Digitados: " + Arrays.toString(numero));	

		}

package lista_extra;

import java.util.Scanner;

public class questao_38 {

	public static int lista_Numero(int numero[], int qtde) {

		int menor = Integer.MAX_VALUE;

		for (int i = 0; i < qtde; i++) {
			if (numero[i] % 2 == 0) {

				if (numero[i] < menor) {
					menor = numero[i];
				}

			}
		}

		System.out.println("Menor " + menor);

		return menor;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de números: ");
		int qtde = sc.nextInt();

		int numero[] = new int[qtde];

		for (int i = 0; i < qtde; i++) {
			System.out.println("Digite o " + (i + 1) + "° número: ");
			numero[i] = sc.nextInt();

		}

		lista_Numero(numero, qtde);
		sc.close();
	}

}


		sc.close();
	}

}

package lista_extra;

import java.util.Scanner;

public class questao_39 {

	public static int quantidadeVogal(String palavra) {
		
		int quantidade = 0;
		char vogal[] = {'a', 'e', 'i', 'o', 'u'};
		
		for (int i = 0; i < palavra.length(); i++) {
			for (char c : vogal) {
				if(palavra.charAt(i) == c) {
					quantidade ++;
					
				}
			}
		}
		
		System.out.println("Quantidade de vogais: " + quantidade);
		
		return quantidade;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		
		System.out.println("Digite uma palavra : ");
		String palavra = sc.nextLine();
		
		quantidadeVogal(palavra);
		
	}

}

package lista_extra;

import java.util.Scanner;

public class questao_40 {

	public static int soma_Positiva(int numero[]) {
		
		int soma = 0;
		
		for (int i = 0; i < numero.length; i++) {
			if(numero[i] > 0) {
				soma += numero[i];
			}
		}
		
		System.out.println("Soma dos positivos: " + soma);
		
		return soma;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de valores que terá na sua lista: ");
		int qtde = sc.nextInt();
		
		int numero[] = new int[qtde];
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite o " +(i+1)+ "° número: ");
			numero[i] = sc.nextInt();
		}
		
		soma_Positiva(numero);
		
	}

}

