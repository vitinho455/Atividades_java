import java.util.Scanner;

public class questao_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int soma = 0, i;

        for (i = 1; i <= numero; i++) {

          soma += (int) Math.pow(i,2);


        }
        System.out.println("Soma dos quadrados = " + soma);
    }
}
