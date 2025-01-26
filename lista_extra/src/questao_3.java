import java.util.Scanner;

public class questao_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0,num2 = 1 ,num3;

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        while(num1 <= numero) {
            System.out.print(num1 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

        }
    }
}
