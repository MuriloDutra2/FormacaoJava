
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(200);
		
		
		ContaPoupanca cp = new ContaPoupanca(333, 444);
		cp.deposita(500);
		
		//tranfere
		
		cc.transfere(100, cp);
		
		System.out.println("cc: " + cc.getSaldo());
	
		System.out.println("cp: " + cp.getSaldo());
		
		cc.saca(200);
		
		System.out.println("cc: " + cc.getSaldo());
	
	}
	
}
