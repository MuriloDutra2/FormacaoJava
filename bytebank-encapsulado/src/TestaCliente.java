public class TestaCliente {
	public static void main(String[] args) {
	
		Cliente murilo = new Cliente();
		
		//colocando o nome
		
		murilo.setNome("Murilo");
		
		System.out.println("O nome do cliente é " + murilo.getNome());
		
		//colocando cpf
		
		murilo.setCpf("332-587-417-89");
		
		System.out.println("O cpf do cliente é "  + murilo.getCpf());
		
		//colocando profissao:
		murilo.setProfissao("Bilionario");
		
		System.out.println("A profissão do cliente é: " + murilo.getProfissao());
		
		//------------------------------------------------------------------------------
		
		//Criando a conta do Murilo: 
		
		Conta contaDoMurilo = new Conta(2006, 11122006);
		
		//depositando dinheiro
		contaDoMurilo.deposita(2000);
		
		System.out.println("O Saldo dessa conta é " + contaDoMurilo.getSaldo() );
		
		
		System.out.println("A agencia dessa conta é " + contaDoMurilo.getAgencia());
		
			
		System.out.println("O numero dessa conta é " + contaDoMurilo.getNumero());
		
		//Titular
		contaDoMurilo.setTitular(murilo);
		
		
		System.out.println("O Titular dessa conta é " + contaDoMurilo.getTitular());
		
		
		Conta conta = new Conta(2006,2580);
		
		
		System.out.println(Conta.getTotal());
		
		
		
	}
}