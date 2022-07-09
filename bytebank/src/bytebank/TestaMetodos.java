package bytebank;

public class TestaMetodos {

	public static void main(String[] args) {
		
		Conta contaDoMurilo = new Conta();
		
		
		//teste Deposita
		contaDoMurilo.deposita(1000);
		System.out.println(contaDoMurilo.saldo);
		
		//teste saca
		contaDoMurilo.saca(500);
			System.out.println(contaDoMurilo.saldo);
			
		//teste tranfere
		Conta contaDoRicardo = new Conta();
		
		contaDoRicardo.deposita(2000);
		System.out.println(contaDoRicardo.saldo);
		
		contaDoRicardo.transfere(1000, contaDoMurilo);
			System.out.println(contaDoRicardo.saldo);
			System.out.println(contaDoMurilo.saldo);
		
		
	}
}
