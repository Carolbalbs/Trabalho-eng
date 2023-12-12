package projeto_final_eng;

public class CommandConsultarHistorico implements ICommand {
    private SistemaBiblioteca sistema;
    

    @Override
    public void execute(CarregarArgs args) {
        int codID = args.getArgs1();
        sistema.consultarLivro(codID);
    }
}