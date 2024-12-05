import java.util.Scanner;

public class questao_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;



do{
    System.out.println("Digite um valor para n:");
    n = sc.nextInt();

    if(n <= 0){

        System.out.println("Valor inválido! Digite outro valor: ");
        n = sc.nextInt();

    }

 }while(n <= 0);


        for (int j = 1; j <= n; j++) {

            System.out.print(j + " ");

        }

    }
}

