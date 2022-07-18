
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente murilo = new Gerente();
		
		//nome, cpf e salario do gerente
		murilo.setNome("Murilo Dutra");
		
		murilo.setCpf("11122233344");
		
		murilo.setSalario(5000.0);
		
		//Desingner
		Desingner nico = new Desingner();
		
		nico.setNome("Nico Sepatt");
		nico.setCpf("99988877744");
		nico.setSalario(2400.0);
	
		//editor de video
		EditorVideo joao = new EditorVideo();
		
		joao.setNome("Joao Pedro");
		joao.setCpf("55544466688");
		joao.setSalario(3400.0);
		
		
		
		//imprimindo
		
		//gerente
		System.out.println("O nome do gerente é: " + murilo.getNome());
		System.out.println("O CPF do gerente é: " + murilo.getCpf());
		System.out.println("O Salario do gerente é: " + murilo.getSalario());
		
		
		System.out.println("");
		
		
		//Designer
		System.out.println("O nome do Desingner é:  " + nico.getNome());
		System.out.println("O CPF do Desingner é: " + nico.getCpf());
		System.out.println("O Salario do Desingner é: " + nico.getSalario());
		
		System.out.println("");
		//Editor de video
		
		System.out.println("O nome do Editor de video é:  " + joao.getNome());
		System.out.println("O CPF do Editor de video é: " + joao.getCpf());
		System.out.println("O Salario do Editor de video é: " + joao.getSalario());
		
	}
}
