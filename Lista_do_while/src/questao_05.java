import java.util.Scanner;

public class questao_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0, media = 0, i = 1;

        while (i <= 10) {
            System.out.println("Digite o " + i + "° valor: ");
            int valor = sc.nextInt();
            contador++;
            media += valor;
            i++;
        }

        media /= contador;

        System.out.println("Média = " + media);
        sc.close();
    }
}
