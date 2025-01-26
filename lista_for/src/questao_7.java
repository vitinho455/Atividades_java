import java.util.Scanner;

public class questao_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a quantidade de valores: ");
        int valores = sc.nextInt();

        int contador = 0;

        System.out.print("Existem ");
        for (int i = 1; i < valores; i++) {
            if( (i % 2 == 0) && (i % 3 == 0) ) {
                contador++;
            }

        }
        System.out.print(contador + " números divisiveis por 2 e 3 = ");

        for (int i = 1; i < valores; i++) {
            if( (i % 2 == 0) && (i % 3 == 0) ) {
                System.out.print(i + " ");
            }

        }
        }
    }

