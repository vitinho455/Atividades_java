package avaliacao;
import java.util.Scanner;

public class questao_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String mandante, visitante;
		int gol_visitante, gol_mandante;
		
		System.out.print("Digite o nome do mandante: ");
		mandante = sc.nextLine();
		
		System.out.print("Digite o nome do visitante: ");
		visitante = sc.nextLine();
		
		System.out.print("Digite o placar do mandante: ");
		gol_visitante = sc.nextInt();
		
		System.out.print("Digite o placar do visitante: ");
		gol_mandante = sc.nextInt();
		
		if(gol_mandante > gol_visitante) {
			
			System.out.println("Time vencedor: " + mandante);
			
		}
		else if(gol_visitante > gol_mandante) {
			System.out.println("Time vencedor: " + visitante);
		
		}else {
			System.out.println("Empate!");
		}
		
	}

}
