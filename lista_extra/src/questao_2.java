import java.util.Scanner;

public class questao_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        int soma = 0;
         for (int i = 0 ;i <= numero; i++) {

            soma += i;

        }
        System.out.println("Soma = " + soma);

    }
}
