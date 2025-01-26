package avaliacao;
import java.util.Scanner;


public class questao_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		int codigoUsuario, codigoArmazenado = 1234, senhaArmazenada = 9999, senhaUsuario = 0;
		
		
		
		do {
			
			System.out.print("Digite o código:");
			codigoUsuario = sc.nextInt();
			
			if(codigoUsuario == codigoArmazenado) {
				
				//sem condição para não afetar o restante do programa.
				
			}else {
				System.out.println("Código inválido!");
				
			}
			
			
			
			
		}while(codigoUsuario != codigoArmazenado);
		
		
		
		
		do {
			
			System.out.print("Digite a sua senha: ");
			senhaUsuario = sc.nextInt();
			
			if(senhaUsuario == senhaArmazenada) {
				
				System.out.println("Acesso liberado!");
				
			}else {
				
				System.out.println("Senha incorreta!");
			}
			
		}while(senhaUsuario != senhaArmazenada);
		
		
		
		
		sc.close();
	}

}
