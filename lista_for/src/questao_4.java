import java.util.Scanner;

public class questao_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para saber a sua tabuada: ");
        int numero = sc.nextInt();

        for (int i = 10; i >= 1; i--) {

            System.out.println(numero + " x " + i + " = " + (numero * i));

        }

    }
}
