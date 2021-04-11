public class ReinoAnimal {
	public static void main(String[] args) {
		System.out.println("ok...");

		Animal[] animais = new Animal[4];
		animais[0] = new Cachorro("Thor");
		animais[1] = new Gato("Bob");
		animais[2] = new Cachorro("Locky");
		animais[3] = new Gato("Gaia");

		for(int indice = 0; indice < 4; indice++)
			animais[indice].respira();

		for(int indice = 0; indice < 4; indice++)
			animais[indice].fazBarulho();
	}
}

abstract class Animal {
	protected String nome;

	public Animal(String nome) {
		this.nome = nome;
	}

	public void respira() {
		System.out.println(
			String.format("Animal '%s' respirou.", this.nome)
		);
	}

	public void fazBarulho() {
		System.out.println(
			String.format("Animal '%s' fez baulho.", this.nome)
		);
	}
}

class Cachorro extends Animal {
	public Cachorro(String nome) {
		super(nome);
	}

	public void fazBarulho() {
		System.out.println(
			String.format("Cachorro '%s' latiu!", this.nome)
		);
	}
}

class Gato extends Animal {
	public Gato(String nome) {
		super(nome);
	}

	public void fazBarulho() {
		System.out.println(
			String.format("Gato '%s' miou!", this.nome)
		);
	}
}
