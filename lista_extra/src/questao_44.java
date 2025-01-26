public class questao_44 {
    public static void main(String[] args) {

        String palavra = "arara";
        String palindromo = new StringBuilder (palavra).reverse().toString();

        if(palavra.equals(palindromo)){

            System.out.println("A string é um palíndromo!");
        }else {

            System.out.println("A string não é um palíndromo!" + palindromo);
        }
    }
}
