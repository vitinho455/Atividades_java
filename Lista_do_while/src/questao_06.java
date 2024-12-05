package lista_do_while;
import java.util.Scanner;


public class questao_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numeroAluno, contador = 0;
		
		double media = 0, nota;
		
		System.out.println("Digite a quantidade de alunos: ");
		numeroAluno = sc.nextInt();
		
		
		for(int i = 1; i <= numeroAluno; i++) {
		
			System.out.println("Digite a " + i + "° nota: ");
			nota = sc.nextDouble();
			media += numeroAluno;
			contador ++;
			
		}
		
		media /= contador;
		
		System.out.print("Media de notas = " + media);
		
		
		
	}

}
