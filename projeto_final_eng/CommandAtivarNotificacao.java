package projeto_final_eng;

public class CommandAtivarNotificacao implements ICommand {
    private SistemaBiblioteca sistema;
    private CarregarArgs args;

    public CommandAtivarNotificacao() {
        this.sistema = sistema;
        this.args = args;
    }

    @Override
    public void execute(CarregarArgs args) {
        int codID = Integer.parseInt(args.getArgs1());
        sistema.ativarNotificacoes(codID);
    }
}