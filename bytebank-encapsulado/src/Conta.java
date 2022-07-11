

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero ) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		 total++;
		System.out.println("Conta criada ");
	}

	
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
	
	
	//agencia get
	public int getAgencia() {
		return agencia;
	}
	
	
	//Numero get
	public int getNumero() {
		return numero;
	}
	

	//Titular get e set
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//Total get
	public static int getTotal() {
		return total;
	}
	
}
	
