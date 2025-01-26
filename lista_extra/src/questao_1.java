import java.util.Scanner;

public class questao_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {

            System.out.println(i);
        }
    sc.close();
    }

}
