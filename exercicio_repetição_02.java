

package exercicios_repeti��o;

import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.

public class exercicio_repeti��o_02 { 
	
	public static void main(String[] args) {
		
		int impar = 0, par = 0;
		Scanner leia = new Scanner(System.in);
		
		for( int i = 0; i < 10; i++) {
		
		System.out.println("Digite um numero: ");
		 int x =leia.nextInt();
		 

		if (x % 2 != 0 ) {
			impar = impar + 1;
		}
		else{
			par = par + 1;
		}
		
		}
		System.out.println("Existem " + par + " numeros pares, e " + impar + " numeros impares.");
	
		
		
    }
	
}
