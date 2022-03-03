package condicional.generation;

import java.util.Scanner;


public class exercicio_condicional_03 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Qual a sua idade: ");
		idade = leia.nextInt();
		
		if ( idade >= 10 && idade <= 14) {
			System.out.println("Voce tem " + idade + " anos e esta na categoria infantil.");
		}
		else if( idade >= 15 && idade <= 17) {
			System.out.println("Voce tem " + idade + " anos e esta na categoria juvenil.");
		}
		else if( idade >= 16 && idade <= 25) {
			System.out.println("Voce tem " + idade + " anos e esta na categoria adulto.");
		} else {
			System.out.println("Voce tem " + idade + " anos e nao esta em nenhuma categoria.");
		}
	}

}
