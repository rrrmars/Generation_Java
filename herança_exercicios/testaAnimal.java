package herança_exercicios;

public class testaAnimal {

		public static void main(String[] args) {
			
			Animal cavalo = new Animal();
			Animal cachorro = new Animal();
			Animal preguica = new Animal();
			
			cavalo.setNome("Osvaldo");
			cavalo.setIdade(2);
			cavalo.setSom("Relincha");
			cavalo.setmovimento("Galopa");
			
			
			
			cachorro.setNome("Eduardo");
			cachorro.setIdade(5);
			cachorro.setSom("Late");
			cachorro.setmovimento("Corre");
			
			preguica.setNome("Julius");
			preguica.setIdade(7);
			preguica.setSom("bali");
			preguica.setmovimento("Sobe em arvores");
			
			System.out.println("Nome: " + cavalo.getNome());
			System.out.println("Idade: " + cavalo.getIdade());
			System.out.println("Som emitido: " + cavalo.getSom());
			System.out.println();
			System.out.println("Nome: " + cachorro.getNome());
			System.out.println("Idade: " + cachorro.getIdade());
			System.out.println("Som emitido: " + cachorro.getSom());
			System.out.println();
			System.out.println("Nome: " + preguica.getNome());
			System.out.println("Idade: " + preguica.getIdade());
			System.out.println("Som emitido: " + preguica.getSom());
			System.out.println();
			
			
			
			
		}
}
