import java.util.Scanner;

public class questao_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número para saber a tabuada: ");
        int numero = sc.nextInt();


        for (int i = 1; i <= 10; i++) {

            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        sc.close();
    }
}
