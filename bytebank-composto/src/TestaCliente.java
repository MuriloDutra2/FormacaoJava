
public class TestaCliente {
	public static void main(String[] args) {
		
		Conta contaDoMurilo = new Conta();
		
		contaDoMurilo.deposita(10000);
		
		
		contaDoMurilo.titular = new Cliente();
		
		contaDoMurilo.titular.nome = "Murilo Dutra";
		contaDoMurilo.titular.cpf = "321.431.567.44";
		contaDoMurilo.titular.profissao = "bilionario";
		
		System.out.println(contaDoMurilo.titular.nome);
		System.out.println(contaDoMurilo.titular.cpf);
		System.out.println(contaDoMurilo.titular.profissao);
		
		System.out.println("O saldo de Murilo Dutra é " + contaDoMurilo.saldo);
		
		
	}

}
