package avaliacao;

import java.util.Scanner;

public class questao_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        boolean status = false;
        int i;
        String nome[] = new String[5], nome2;

        
        for(i = 0; i < 5; i++) {
        	
        	System.out.println("Digite o " + (i + 1) + "° nome:");
        	nome[i] = sc.nextLine();
        
        }
       
        System.out.println("Digite mais um nome:");
    	nome2 = sc.nextLine();
    
    	
    	for(i = 0; i < 5; i++) {
    		if(nome2.equals(nome[i])) {
    			status = true;
    			break;
    		}
    	}
    		
    		if(status) {
    			
    			System.out.println("Achei!");
    		}else {
    			System.out.println("Não achei!");
    		}
    		
    		sc.close();
    		
   
    	
    	
    	
	}
}
	
