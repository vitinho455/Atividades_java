public class questao_42 {
    public static void main(String[] args) {

        String palavra = "Banana";

        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
                if(palavra.charAt(i) == 'a'){

                    cont ++;
                }else{
                    continue;
                }

        }

        System.out.print(cont);
    }
}
