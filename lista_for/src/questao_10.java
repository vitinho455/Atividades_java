import java.util.Scanner;

public class questao_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        int qtdeImpar = 0, qtdePar = 0;

        for (int i = 1; i <= numero; i++) {
            if(i % 2 == 0){
                qtdePar ++;
            }else{
                qtdeImpar ++;
            }
        }
        System.out.println("Quantidade de número pares: " + qtdePar);
        System.out.println("Quantidade de número impares: " + qtdeImpar);

    }
}
