package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		
		
		primeiraConta.saldo += 100;
		
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		
		
		System.out.println("A primeira conta tem o saldo de: " + primeiraConta.saldo);
		System.out.println("A segunda conta tem o saldo de: " + segundaConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}

}
