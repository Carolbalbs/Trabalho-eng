package projeto_final_eng;

public class CommandAtivarNotificacao implements ICommand {
    private SistemaBiblioteca sistema;


    @Override
    public void execute(CarregarArgs args) {
        int codID = args.getArgs1();
        sistema.ativarNotificacoes(codID);
    }
}