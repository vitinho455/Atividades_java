import java.util.Scanner;

public class questao_04 {

    static Thread t = new Thread();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.print(i + " ");
            try {
                t.sleep(1000);
            } catch (InterruptedException e) {

            }

        }
        System.out.println("FIM!");
        sc.close();
    }
}
