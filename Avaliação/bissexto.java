package avaliacao;
import java.util.Scanner;
public class bissexto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ano;
		
		System.out.print("Digite o ano desejado: ");
		ano = sc.nextInt();
		
		// Se um ano não é divisivel por 100, ele pode ser bissexto ou se um ano é divisivel por 100, ele tabmém precisa ser divisivel por 400 para ser bissexto.
		if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
			
			System.out.println("O ano é bissexto!");
			
		}
		else {
			System.out.println("O ano não é bissexto!");
		}
		

	}

}
