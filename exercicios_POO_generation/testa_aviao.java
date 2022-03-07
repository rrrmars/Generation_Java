package exercicios_POO_generation;


public class testa_aviao {

	public static void main(String[] args) {
		
		aviao a1 = new aviao();
		
		a1.setMarca("Airbus");
		a1.setModelo("A330");
		a1.setnumPassageiros(250);
		
		System.out.println("Marca: " + a1.getMarca());
		System.out.println("Modelo: " + a1.getModelo());
		System.out.println("Quantidade de passageiros: " + a1.getnumPassageiros());
		
		

	}

}
