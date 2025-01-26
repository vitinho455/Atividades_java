import java.util.Scanner;

public class questao_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número:");
        int numero = sc.nextInt();

        if(numero % 1 == 0){

            System.out.println("O número não é primo!");
        }else {
            System.out.println("O número é primo!");
        }
    }
}
