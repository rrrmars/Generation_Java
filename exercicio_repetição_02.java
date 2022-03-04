

package exercicios_repetição;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares.

public class exercicio_repetição_02 { 
	
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
