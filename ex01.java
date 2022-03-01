
import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anos, meses, dias;
		
		System.out.println("Digite a sua idade em anos: ");
		anos = leia.nextInt();
		
		meses = (anos * 12);
		
		System.out.println("Sua idade em meses eh: " + meses);
		
		dias = (anos * 365);
		
		System.out.println("Sua idade em dias eh: " + dias);
		
		leia.close();
		
		
	}
	
	
	
	

}
