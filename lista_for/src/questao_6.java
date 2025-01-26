import java.util.Scanner;

public class questao_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;

        System.out.println("Digite a quantidade de linhas da piramide: ");
        int linhas = sc.nextInt();

        for ( i = 1; i <= linhas; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
