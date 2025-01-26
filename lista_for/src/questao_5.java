import java.util.Scanner;

public class questao_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroMaximo = Integer.MIN_VALUE;

        System.out.print("Digite a quantidade de números que você irá digitar:");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {

            System.out.print("Digite o " + i + " número:");
            int numeroDigitar = sc.nextInt();

            if(numeroDigitar > numeroMaximo) {
                numeroMaximo = numeroDigitar;
            }
        }

        System.out.print("Maior número = "+ numeroMaximo);
    }
}
