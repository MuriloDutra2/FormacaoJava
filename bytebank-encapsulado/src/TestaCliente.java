public class TestaCliente {
	public static void main(String[] args) {
	
		Cliente murilo = new Cliente();
		
		//colocando o nome
		
		murilo.setNome("Murilo");
		
		System.out.println("O nome do cliente � " + murilo.getNome());
		
		//colocando cpf
		
		murilo.setCpf("332-587-417-89");
		
		System.out.println("O cpf do cliente � "  + murilo.getCpf());
		
		//colocando profissao:
		murilo.setProfissao("Bilionario");
		
		System.out.println("A profiss�o do cliente �: " + murilo.getProfissao());
		
		//------------------------------------------------------------------------------
		
		//Criando a conta do Murilo: 
		
		Conta contaDoMurilo = new Conta();
		
		//depositando dinheiro
		contaDoMurilo.deposita(2000);
		
		System.out.println("O Saldo dessa conta � " + contaDoMurilo.getSaldo() );
		
		//Agencia:
		contaDoMurilo.setAgencia(2006);
		
		System.out.println("A agencia dessa conta � " + contaDoMurilo.getAgencia());
		
		//Numero
		
		contaDoMurilo.setNumero(11122006);
		
		System.out.println("O numero dessa conta � " + contaDoMurilo.getNumero());
		
		//Titular
		contaDoMurilo.setTitular(murilo);
		
		
		System.out.println("O Titular dessa conta � " + contaDoMurilo.getTitular());
		
		
		
	}
}