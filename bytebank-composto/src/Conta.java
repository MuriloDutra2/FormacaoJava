

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

	
	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Depositado com sucesso");
	}
	
	
	// metodo saca
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Valor sacado com sucesso");
			return true;
		}
			System.out.println("Valor a ser sacado insuficiente");
			return false;
			
	
	}
	
	
	//metodo transfere
	public boolean transfere (double valor, Conta destino) {
		if (saca(valor)) {
			destino.deposita(valor);
			System.out.println("Transferencia com sucesso");
			return true;
			
		}
			System.out.println("Tranferencia cancelada");
			return false;
		
	}
}
	
