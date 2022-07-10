

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	
	// metodo saca
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
			return false;
			
	
	}
	
	
	//metodo transfere
	public boolean transfere (double valor, Conta destino) {
		if (saca(valor)) {
			destino.deposita(valor);
			return true;
			
		}
			return false;
		
	}
	
	//Saldo get 
	public double getSaldo() {
		return saldo;
	}
	
	
	//agencia get e set
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	//Numero get e set
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//Titular get e set
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}
	
