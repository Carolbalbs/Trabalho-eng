package projeto_final_eng;

public class Cliente {
    public static void main(String[] args) {


    	        Entrada entrada = new Entrada();
    	        entrada.iniciarComando();

    	        // Exemplo de execução de comando
    	        CarregarArgs argsTest = new CarregarArgs(0, 0);
    	        entrada.executarComando("emp", argsTest);
    }   	  
}
