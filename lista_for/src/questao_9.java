import java.util.Scanner;

public class questao_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas na piramide:");
        int linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int j = linhas; j > i; j--) {
                System.out.print(" ");
            }
            for (int L = 1; L <= i; L++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

