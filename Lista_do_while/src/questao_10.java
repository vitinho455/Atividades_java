package lista_do_while;
import java.util.Random;
import java.util.Scanner;

public class questao_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new Thread();
		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		
		String escolha;
		int insira, somaAleatorio = 0, pontuacao = 0, numeroGerado = 0, somaUsuario = 0;
		boolean decisao = true;
		
		do {
			
			System.out.println("Sua pontuação é: " + pontuacao);
			
			System.out.println("Escolha entre par ou impar: ");
			escolha = sc.nextLine();
			
			System.out.println("Insira um número de 0 a 10 ");
			System.out.println();
			
			for(int i = 0; i < 10; i++) {
				
				System.out.println("Insira o " + (i+1) + "° valor: ");
				insira = sc.nextInt();
				
				somaUsuario += insira;	
			}
			
			System.out.println("Gerando um número de 0 a 10.....");
			for(int i = 0; i <= 10; i++) {
			
				
				
				numeroGerado = gerador.nextInt(10);
				System.out.print(numeroGerado + " ");
				System.out.println();
				
				
				somaAleatorio += numeroGerado;
				try {
					 t.sleep(1000);
				}catch(InterruptedException e){
					
				} 
				
				
			}
			
			
			
			System.out.println("Soma dos números gerados pelo sistema = " + somaAleatorio);
			System.out.println("Soma dos números inseridos pelo usuário = " + somaUsuario);
			
			
			// condição para a soma aleatória
			if(somaAleatorio % 2 == 0) {
				
				System.out.println("A soma do sistema é par!");
			}else {
				
				System.out.println("A soma do sistema é impar!");
			}
			
			// condição para a soma do usuário
			
			if(somaUsuario % 2 == 0) {
				
				System.out.println("A soma do usuario é par!");
			}else {
				
				System.out.println("A soma do usuario é impar!");
			}
			

			
			if(somaAleatorio > somaUsuario) {
				
				System.out.println("Você perdeu!");
				
				
			}else {
				System.out.println("Parabéns! Você ganhou um ponto");
				
				System.out.println("Você ganhou!");
				pontuacao += 1;
			}
			
			
			
			
			
			
			
			System.out.println("Você quer continuar (True || False): ");
			decisao = sc.nextBoolean();
			
			
		}while(decisao);
		
	}

}
