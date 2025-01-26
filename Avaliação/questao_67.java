package avaliacao;
import java.util.Scanner;

public class questao_67 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra = "java"; // palavra a ser adivinhada
        char letras[] = new char[palavra.length()]; 

       
        for (int i = 0; i < letras.length; i++) {
            letras[i] = '_';
        }

        boolean status = true; // Status do jogo
        int tentativas = 10; // número de tentativas

        
        while (status) {
            System.out.print("Palavra: ");
            for (char letra : letras) {
                System.out.print(letra + " ");
                
            }
            System.out.println("\nTentativas restantes: " + tentativas); 
            System.out.println();
            
            System.out.print("Digite uma letra: ");
            char tentativa = sc.nextLine().charAt(0);
            boolean acerto = false;

            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == tentativa) {
                    letras[i] = tentativa; 
                    acerto = true;
                }
            }

            if (!acerto) {
                System.out.println("Letra incorreta!");
                tentativas--;
            } else {
                System.out.println("Você acertou uma letra!");
            }

            boolean palavra_completa = true;
            for (int i = 0; i < letras.length; i++) {
                if (letras[i] == '_') {
                    palavra_completa = false;
                    break;
                }
            }

            if (palavra_completa) {
                System.out.println("Parabéns! Você adivinhou a palavra: " + palavra);
                status = false;
            } else if (tentativas == 0) {
                System.out.println("Você perdeu! A palavra correta era: " + palavra);
                status = false;
            }
        }
        sc.close();
    }
}
