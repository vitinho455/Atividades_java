package avaliacao;

import java.util.Scanner;

public class questao_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		int quantidadeMorangos,quantidadeMacas, quantidadeKG;
		double ValorTotal, desconto;
		
		System.out.println("Até 5 KG ||Maçãs = R$ 2,50 || Morango = R$ 1,80");
		System.out.println("Mais de 5 KG ||Maçãs = R$ 2,20 || Morango = R$ 1,50");
		System.out.println();
		
		System.out.println("Digite a quantidade de maçãs adquiridas: ");
		quantidadeMacas = sc.nextInt();
		
		System.out.println("Digite a quantidade de morangos adquiridas: ");
		quantidadeMorangos = sc.nextInt();
		
		quantidadeKG = quantidadeMacas + quantidadeMorangos;
		
		
		
		if(quantidadeKG > 5) {
			
			ValorTotal = (quantidadeMacas * 2.20) + (quantidadeMorangos * 1.50) ;
			
		}else {
			
			ValorTotal = (quantidadeMacas * 2.50) + (quantidadeMorangos * 1.80) ;
			
		}
	
		
		if(quantidadeKG > 8 || ValorTotal > 25.00) {
			
			desconto = ValorTotal * 0.10;
			
			ValorTotal -= desconto;
			
		}else {
			
			desconto = 0;
		}
		
		System.out.println("Total a pagar = R$ " + String.format("%.2f", ValorTotal));
		System.out.println("Desconto = R$ " + String.format("%.2f", desconto));
	}

}
