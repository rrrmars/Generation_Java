import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int dias, meses, anos;
		System.out.println("Digite a sua idade em dias: ");
		dias = leia.nextInt();
		
		meses = (dias / 12);
		System.out.println("Sua idade em meses eh: " + meses);
		
		anos = (dias / 365);
		System.out.println("Sua idade em anos eh: " + anos);
		
		leia.close();
		

}
}