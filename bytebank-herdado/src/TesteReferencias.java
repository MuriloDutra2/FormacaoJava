
public class TesteReferencias {

	public static void main(String[] args) {
		
		//Informações
		Gerente g1 = new Gerente();
		g1.setNome("Murilo Dutra");
		g1.setCpf("33322211166");
		g1.setSenha(3333);
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("João");
		ev.setCpf("77788899955");
		ev.setSalario(2000.0);
		
		Desingner d = new Desingner();
		d.setNome("heytor");
		d.setCpf("77788899944");
		d.setSalario(2500.0);
		
		//Registrando os funcionarios
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		
		controle.registra(ev);
		
		controle.registra(d);
		
		//imrpimindo a bonificacao;
		
		System.out.println(controle.getSoma());
		
		
		
	}

}
