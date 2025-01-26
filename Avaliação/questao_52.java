package avaliacao;

import java.util.Scanner;

public class questao_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 59; i++) {
        		
        	System.out.print("+");
  
        }
        
        for(int j = 0; j < 10; j++) 
        
        { System.out.print("+"); 
        
        for(int i = 0; i < 58; i++) 
        
		{
			System.out.print(" ");  
        }
        
        System.out.println("+");        
        }
        for(int i = 10; i < 70; i++) {
        	
        	System.out.print("+");
        }
 
        
        sc.close();
	}

}
