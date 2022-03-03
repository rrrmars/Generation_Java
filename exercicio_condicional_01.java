
package condicional.generation;

import java.util.Scanner;


public class exercicio_condicional_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int numero1, numero2, numero3, maiorNumero=0;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		numero3 = leia.nextInt();
		
		if ( numero1 > maiorNumero ) {
			maiorNumero = numero1;
		}
		if ( numero2 > maiorNumero ) {
			maiorNumero = numero2;
        }
		if ( numero3 > maiorNumero ) {
			maiorNumero = numero3;
		}
		
		System.out.println("O maior numero digitado eh: " + maiorNumero);
	}

}
