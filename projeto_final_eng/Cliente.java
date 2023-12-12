package projeto_final_eng;

public class Cliente {
    public static void main(String[] args) {


    	        Entrada entrada = new Entrada();
    	        entrada.iniciarComando();

    	        // Exemplo de execução de comando emprestimo
    	        CarregarArgs emprestimo = new CarregarArgs(001, 003);
    	        entrada.executarComando("emp", emprestimo);
    	        
    	        CarregarArgs reseva = new CarregarArgs(001, 003);
    	        entrada.executarComando("res", reseva);
    	        
    	        CarregarArgs devolucao = new CarregarArgs(001, 003);
    	        entrada.executarComando("dev", devolucao);
    	        
    	        CarregarArgs consulta = new CarregarArgs(001, 003);
    	        entrada.executarComando("liv", consulta);
    	        
    	        CarregarArgs historico = new CarregarArgs(002, 0);
    	        entrada.executarComando("usu", historico);
    	        
    	        CarregarArgs notificacao = new CarregarArgs(001, 003);
    	        entrada.executarComando("nft", notificacao);
    	        
    	        CarregarArgs observador = new CarregarArgs(001, 003);
    	        entrada.executarComando("obs", observador);
    }   	  
}
