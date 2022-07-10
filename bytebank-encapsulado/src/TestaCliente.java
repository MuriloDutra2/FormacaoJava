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
		
		Conta contaDoMurilo = new Conta();
		
		//depositando dinheiro
		contaDoMurilo.deposita(2000);
		
		System.out.println("O Saldo dessa conta é " + contaDoMurilo.getSaldo() );
		
		//Agencia:
		contaDoMurilo.setAgencia(2006);
		
		System.out.println("A agencia dessa conta é " + contaDoMurilo.getAgencia());
		
		//Numero
		
		contaDoMurilo.setNumero(11122006);
		
		System.out.println("O numero dessa conta é " + contaDoMurilo.getNumero());
		
		//Titular
		contaDoMurilo.setTitular(murilo);
		
		
		System.out.println("O Titular dessa conta é " + contaDoMurilo.getTitular());
		
		
		
	}
}