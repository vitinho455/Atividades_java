package avaliacao;

import java.util.Scanner;

public class questao_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int soma;
		int idadeMasculino[] = new int[2];
		int idadeFeminina[] = new int[2];
		
		for(int i = 0; i < 2; i++) {
			
			System.out.println("Digite a idade do " + (i + 1) + "° homem: ");
			idadeMasculino[i] = sc.nextInt();
			
			
		}
		
		for(int j = 0; j < 2; j++) {
			
			System.out.println("Digite a idade da " + (j + 1)  + "° mulher: ");
			idadeFeminina[j] = sc.nextInt();
			
		}
		
		sc.close();
	
	//Homem mais velho e mulher mais nova.
	int homemVelho = Math.max(idadeMasculino[0],idadeMasculino[1]); 
	int mulherNova = Math.min(idadeFeminina[0],idadeFeminina[1]);
	
	//Mulher mais velha e homem mais novo.
	int homemNovo = Math.min(idadeMasculino[0],idadeMasculino[1]); 
	int mulherVelha = Math.max(idadeFeminina[0],idadeFeminina[1]);
	
	System.out.println("Soma do homem mais velho e mulher mais nova = " + (homemVelho + mulherNova));
	System.out.println("Soma do homem mais novo e mulher mais velha = " + (homemNovo + mulherVelha));
	
	}

}

