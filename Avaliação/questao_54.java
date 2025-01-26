package avaliacao;

import java.util.Scanner;

public class questao_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  Scanner sc = new Scanner(System.in);

		  int alunos[] = new int[5], quantidade = 0, n = 0, soma = 0, quantidadeNotaAcima;
		
		  for(int i = 0; i < 5; i++) {
			  
			  System.out.println("Digite a nota do " + (i + 1) +"° aluno: " );
			  alunos[i] = sc.nextInt();
			  soma += alunos[i];
			  quantidade ++;
			  
		  }
		  
		  int media = soma / quantidade;
		  
		  System.out.println("Media = " + media);
		  
		  
		  quantidadeNotaAcima = 0;
		  
		  for(int i = 0; i < 5; i++) {
			  if(alunos[i] > media) {
				  quantidadeNotaAcima ++;	  
			  }
			  
			  
		  }
		  
		  System.out.println("Quantidade de alunos que obtiveram nota acima da média: " + quantidadeNotaAcima);
	
	sc.close();
	}

}
