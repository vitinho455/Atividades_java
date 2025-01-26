package avaliacao;

import java.util.Scanner;

public class questao_59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,n;
		
		System.out.println("Digite a quantidade de elementos nos vetores: ");
		n = sc.nextInt();
		
		int A[] = new int [n];
		int B[] = new int [n];
		
		
		for(i = 0; i < n; i++) {
		
			System.out.println("Digite o " + (i + 1) + "°" + " valor de A:");
			A[i] = sc.nextInt();
			
		}
		
		System.out.println("Valores de B");
		
		for(i = 0; i < n; i++) {
			
			System.out.println("Digite o " + (i + 1) + "°" + " valor de B:");
			B[i] = sc.nextInt();
			
		}
		
		int C[] = new int[n];
		
		for(i = 0; i < n; i++) {
			
			C[i] = A[i] + B[i];
			System.out.print(C[i] + " ");
			
			
		}
		
		sc.close();
		
		
	}

}
