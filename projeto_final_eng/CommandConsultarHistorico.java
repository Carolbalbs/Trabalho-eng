package projeto_final_eng;

public class CommandConsultarHistorico implements ICommand {
    private SistemaBiblioteca sistema;
    private CarregarArgs args;

    public CommandConsultarHistorico() {
        
        this.args = args;
    }

    @Override
    public void execute(CarregarArgs args) {
        int codID = Integer.parseInt(args.getArgs1());
        sistema.consultarHistorico(codID);
    }
}