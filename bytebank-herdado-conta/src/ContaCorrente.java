public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero){
	    super(agencia, numero);
	}
	
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valor);
	}


	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}


	@Override
	public double getValorImposto() {
		return 0.01;
	}
	
}
