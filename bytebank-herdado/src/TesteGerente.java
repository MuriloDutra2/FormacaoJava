
public class TesteGerente {
	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		
		//declarando o nome, cpf e salario
		nico.setNome("Nico");
		
		nico.setCpf("22211133355");
		
		nico.setSalario(7000);
		
		
		//imprimindo
		
		System.out.println("O nome do gerente é: " + nico.getNome());
		
		System.out.println("O cpf do gerente é: " + nico.getCpf());
		
		System.out.println("O salario do gerente é: " + nico.getSalario());
		
	
		//testando senha: 
		
		nico.setSenha(2006);
		
		boolean autenticou = nico.autentica(2006);
		
		System.out.println(autenticou);
		
		System.out.println(nico.getBonificacao());
		
	}

}
