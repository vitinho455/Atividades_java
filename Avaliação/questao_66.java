package avaliacao;

import java.util.Scanner;

public class questao_66 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int i, j;
        int vetor[] = new int[50];
        int aux[] = new int[50]; 
      

        
        for (i = 0; i < 50; i++) {
        
        			
            System.out.println("Digite o " + (i + 1) + "° valor: ");
            vetor[i] = sc.nextInt();
           
        }
        
        System.out.println("Posições dos números repetidos:");
        for (i = 0; i < 50; i++) {
            for (j = i + 1; j < 50; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println("Número " + vetor[i] + " repetido nas posições: " + (i + 1));
                    break; 
                }
            }
        }
        
        sc.close();

    }
}