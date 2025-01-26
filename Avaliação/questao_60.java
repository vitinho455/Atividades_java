package avaliacao;

import java.util.Scanner;

public class questao_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int temp[] = new int[10], maior, menor,media,num_dias = 0, contador = 0, soma = 0;
        Scanner sc = new Scanner(System.in);

		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Digite a temperatura registrada do " + (i +1) + "° dia: ");
			temp[i] = sc.nextInt();
			contador ++;
			soma += temp[i];
			
		}
		
		media = soma / contador;
		
		
		menor = temp[0];	
		for(int i = 0; i < 5; i++) {
			
			if(temp[i] < menor) {
				
				menor = temp[i];
				
			}
		}
	
			maior = 0;
			
			for(int i = 0; i < 5; i++) {
			
			if(temp[i] > maior) {
				
				maior = temp[i];
				
			}
			
			
		}
			
			for(int i = 0; i < 5; i++) {
				
				if(media < temp[i]) {
					
				num_dias++;
					
				}
				
				
			}
			
			
			System.out.println("Maior temperatura do ano: " + maior );
			System.out.println("Menor temperatura do ano: " + menor);
			System.out.println("Média de temperatura: " + media);
			System.out.print("Número de dias de temperatura inferior a média: " + num_dias);
			
			
	sc.close();		
	}
	
}


