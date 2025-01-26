package avaliacao;

import java.util.Scanner;

public class questao_46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    int numero, quantidadeDigitos = 0,n, somaDigitos = 0, maiorDigito = 0;
    double media;
    
    System.out.println("Digite um número: ");
    n = sc.nextInt();
    
    while(n > 0) {
    	int digito = n % 10;
    	n/= 10;
    	quantidadeDigitos++;
    	somaDigitos += digito;
    	maiorDigito = Math.max(maiorDigito, digito);
    	
    }
    
    media = (double)somaDigitos / quantidadeDigitos;
    
    
    System.out.println("Quantidade de dígitos: " + quantidadeDigitos);
    System.out.println("Media = " + String.format("%.2f", media));
    System.out.println("Maior número = " + maiorDigito);
    
    
    }
    
    
    
}