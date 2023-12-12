package projeto_final_eng;

import java.util.HashMap;

public class Entrada{
private HashMap<String, ICommand> comando;


public void iniciarComando(){
	
	comando.put ("emp", new CommandFazerEmprestimo());
	comando.put ("res", new CommandFazerReserva());
	comando.put ("dev", new CommandDevolverlivro());
	comando.put ("liv", new CommandFazerConsulta());
	comando.put ("usu", new CommandConsultarHistorico());
	comando.put ("ntf", new CommandAtivarNotificacao());
	comando.put ("obs", new CommandObserver());
	
	
}

public void executarComando(String nomeComando, CarregarArgs args) {
    comando.get(nomeComando).execute(args);
}

}