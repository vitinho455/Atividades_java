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

			do {
				System.out.println("Escolha entre par ou impar: ");
				escolha = sc.nextLine();
			}while(!escolha.equals("par") && !escolha.equals("impar"));

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
			
			
			boolean resultado = (somaUsuario % 2 == 0 && escolha.equals("par"))||
					(somaUsuario % 2 != 0 && escolha.equals("impar"));

			
			if(resultado) {
				
				System.out.println("Parabéns! Você venceu esta rodada!");
				pontuacao ++;
				
				
			}else{
				System.out.println("O sistema ganhou esta rodada!");
			}

			
			
			System.out.println("Você quer continuar (True || False): ");
			decisao = sc.nextBoolean();
			
			
		}while(decisao);
		
	}

}
