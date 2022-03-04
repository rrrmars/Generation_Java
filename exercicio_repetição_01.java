package repetição.generation.exercicios;

import java.util.Scanner;

public class exercicio_repetição_01 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 1000;
		
		for (numero = 1000; numero >= 1000 && numero <= 1999; numero++) {
			System.out.println(numero);
			numero = leia.nextInt();
		    }
			
			if ((numero / 11) == 5) {
				System.out.println("O numero " + numero + "dividido por 11 resulta em 5");
			}
			
		
	}

}
