
package condicional.generation;

import java.util.Scanner;

public class exercicio_condicional_04 {
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		double raiz, potencia;
		
		
		System.out.println("Digite um numero inteiro: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			raiz = Math.sqrt(numero);
			System.out.println("O numero digitado eh par e a rai quadrada eh: " + raiz);
			
			
		} else {
			potencia = Math.pow(numero, 2);
			System.out.println("O numero digitado eh impar, e o calculo de sua potencia resulta em: " + potencia);
			
		}
		
	}
	
	
	

}
