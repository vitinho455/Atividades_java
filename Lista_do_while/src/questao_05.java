import java.util.Scanner;

public class questao_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0, media = 0;

        for (int i = 1; i <= 10 ; i++) {

            System.out.println("Digite o " + i + "° valor: ");
            int valor = sc.nextInt();
            contador ++;
            media += valor;
        }
        media /= contador;

        System.out.println("Media = " + media);
    }

}
