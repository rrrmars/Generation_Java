package exercicios_repetição;

import java.util.Scanner;

public class exercicio_repetição_03 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		
		
		
		int idade, maior50 = 0, menor21 = 0;
	
		do  {
			  System.out.println("Digite a sua idade: (para finalizar o programa, escreva -99");
			  idade = ler.nextInt();
			  
			  
			  if ( idade < 21 && idade > 0) {
				  menor21 = menor21 + 1;
				  }
			  else if ( idade > 50) {
		    	  maior50 = maior50 +1;
		    	  }
		
		}
		
		while (idade != -99);	
		
		System.out.println("Existem " + menor21 + " pessoas com menos de 21 anos, e " + maior50 + " pessoas com mais de 50 anos");
	}

}
