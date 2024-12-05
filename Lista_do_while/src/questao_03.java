import java.util.Scanner;

public class questao_03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contador = 0;
        for (int i = 1; i <= 10; i++) {


            System.out.println("Digite o " + i + "° valor:");
            int numero = sc.nextInt();

            if(numero < 0) {
                contador++;
            }
        }



        System.out.println("Quantidade de números negativos = " + contador);
    }


}
