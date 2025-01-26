import java.util.Scanner;

public class questao_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digite um valor para N: ");
        n = sc.nextInt();

        int i = 1;

        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        sc.close();
    }
}
