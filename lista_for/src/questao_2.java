import java.util.Scanner;

public class questao_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 0;

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        for(int i = 0; i < palavra.length(); i++){
                if(palavra.charAt(i) == 'a'){

                    contador ++;

                }
        }
        System.out.print("Quantidade de A na palavra " + palavra + " = " + contador);
    }


}
