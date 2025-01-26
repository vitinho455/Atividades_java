import java.util.Scanner;

public class questao_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: " );
        int numero = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <= numero; i++) {

            soma = (int) Math.pow(i,numero );
        }
        System.out.print("Soma dos quadrados = " + soma);
    }
}
