package avaliacao;
import java.util.Scanner;
public class questao_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora_inicio, hora_fim, hora_final;
		
		System.out.print("Digite a hora do inicio da partida: ");
		hora_inicio = sc.nextInt();
		System.out.print("Digite a hora do fim da partida: ");
		hora_fim = sc.nextInt();
	
	
		
		if(hora_fim > hora_inicio) {
			
		hora_final = hora_fim - hora_inicio;
		}
		else {
			hora_final = (24 - hora_inicio) + hora_fim;
		}
	
		if(hora_final < 24) {
			System.out.println("O jogo durou " + hora_final + " horas.");
		}
		else {
			System.out.println("O jogo ultrapassou a quantidade máxima de horas.");
		}
	}

}
