package exercicios_POO_generation;

public class testa_UmCliente {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.primeiroNome = "Caroline";
		c1.sobrenome = "Oliveira";
		c1.idade = 25;
		
		System.out.println(c1.primeiroNome);
		System.out.println(c1.sobrenome);
		System.out.println(c1.idade);
		
		c2.primeiroNome = "Eduardo";
		c2.sobrenome = "Barbosa";
		c2.idade = 21;
		
		System.out.println(c2.primeiroNome);
		System.out.println(c2.sobrenome);
		System.out.println(c2.idade);
		
		
}

}
