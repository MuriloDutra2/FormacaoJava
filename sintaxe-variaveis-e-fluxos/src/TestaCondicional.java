
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando o If");

		int idade = 20;
		int quantidadeDePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos, pode entrar" + " Seja bem vindo");

		} else {
			if (quantidadeDePessoas >= 2) {
				System.out.println("Voce nao tem mais de 18, mas esta acompanhado, pode entrar");
			} else {
				System.out.println("infelizmente voce nao pode entrar");
			}
			
		}
	}
}