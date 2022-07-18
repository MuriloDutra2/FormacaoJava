
public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario murilo = new Funcionario();
		
		//nome, cpf e salario do funcionario
		murilo.setNome("Murilo Dutra");
		
		murilo.setCpf("11122233344");
		
		murilo.setSalario(5000);
		
		
		//imprimindo
		
		System.out.println(murilo.getNome());
		System.out.println(murilo.getCpf());
		System.out.println(murilo.getSalario());
		
		
	}
}
