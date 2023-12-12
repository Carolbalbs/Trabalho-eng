package projeto_final_eng;

public class CommandFazerConsulta implements ICommand {
    private SistemaBiblioteca sistema;

    @Override
    public void execute(CarregarArgs args) {
        int codLivroID = args.getArgs2();
        sistema.consultarLivro(codLivroID);
    }
}