package avaliacao;
import java.util.Scanner;
public class questao_02 {

	public static void main(String[] args) {
		
		int hora,minuto,segundo, total_de_segundos;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite a hora: ");
		hora = sc.nextInt();
		System.out.print("Digite o minuto: ");
		minuto = sc.nextInt();
		System.out.print("Digite os segundos: ");
		segundo = sc.nextInt();
		
		total_de_segundos = (hora * 3600) + (minuto * 60) + segundo;
		
		System.out.println(hora + ":" + minuto + ":" + segundo);
		System.out.println("Quantidade de segundos: " + total_de_segundos);
	}

}
