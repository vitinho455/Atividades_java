import java.util.Scanner;

public class questao_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.print("Divisores de " + numero + " = ");
        for (int i = 1; i <= numero; i++) {
                if(numero % i == 0){
                    System.out.print(i + " ");
                }
        }

    }
}


