
public class TestaSistema {

	public static void main(String[] args) {
	
		
		//Instanciado gerente
		Gerente g = new Gerente();
		g.setSenha(2006);
		
	
		
		Autenticavel murilo = new Gerente();
		murilo.setSenha(8000);
		
		Autenticavel roberto = new Cliente();
		roberto.setSenha(2006);

		Autenticavel gisele = new Administrador();
		gisele.setSenha(7456);
		
		//SistemaInterno
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(g);
		si.autentica(murilo);
		si.autentica(roberto);
		si.autentica(gisele);
		
	}

}
