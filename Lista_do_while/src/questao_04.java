import java.util.Scanner;

public class questao_04 {

    static Thread t = new Thread();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        int i = numero;

        while (i >= 0) {
            System.out.print(i + " ");
            try {
                t.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Erro ao pausar a thread.");
            }

        }

        System.out.println("FIM!");
        sc.close();
    }
}
