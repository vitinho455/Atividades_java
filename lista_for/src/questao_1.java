import java.util.Scanner;

public class questao_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i % 5 == 0){
                continue;
            }

            System.out.println(i);

        }


    }
}
