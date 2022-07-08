
public class Fatorial {
		public static void main(String[] args) {
			
			 int fatorial = 1;
			for ( int numeroAtual = 1; numeroAtual < 11; numeroAtual++ ) {
				fatorial *= numeroAtual;
					System.out.println("Fatorial de " + numeroAtual + " = " + fatorial);
			}
		}

}
