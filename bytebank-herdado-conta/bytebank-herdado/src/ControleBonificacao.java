
public class ControleBonificacao {

	
		//Soma
		 private double soma;
		  public double getSoma() {
			return soma;
		}
		 
		 
		 //registra: 
		    public void registra(Funcionario f) {
		        this.soma += f.getBonificacao();
		    }
		  
		 
		
		
	}

