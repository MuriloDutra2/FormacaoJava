
public class TesteTributavel {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(888, 777);
		
		cc.deposita(1000);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto ci = new CalculadorDeImposto();
		
		ci.registra(cc);
		ci.registra(seguro);
		
		System.out.println(ci.getTotalImposto());
		
	}

}
