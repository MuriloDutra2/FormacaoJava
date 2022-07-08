public class Exercicio {

    public static void main(String[] args) {

        double salario = 3300.0;


        if ( salario >= 1900.0 && salario <= 2800 ) {
        	System.out.println("Sua Aquiliota é de 7,5% ");
        	System.out.println("Voce pode reduzir ate R$142 ");
        } else if (salario >= 2800.01 && salario <= 3751.0 ) {
        	System.out.println("Sua Aquiliota é de 15%");
        	System.out.println("Voce pode reduzir ate R$ 350 ");
        } else if ( salario >= 3751.01 && salario <= 4664.00) {
        	System.out.println("Sua Aquiliota é de 22,5%");
        	System.out.println("Voce pode reduzir ate R$ 636");
        }
        //int contador = 0;
        //while(contador <= 10) {
           // System.out.println(contador);
           // contador++;
       // }
        for( int contador = 0; contador <= 10; contador++ ) {
        	System.out.println(contador);
        }
    }
}



  