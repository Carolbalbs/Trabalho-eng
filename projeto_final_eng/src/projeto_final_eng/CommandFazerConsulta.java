package projeto_final_eng;

public class CommandFazerConsulta implements ICommand {
    private SistemaBiblioteca sistema;
    private CarregarArgs args;

    public CommandFazerConsulta() {
        this.sistema = sistema;
        this.args = args;
    }

    @Override
    public void execute(CarregarArgs args) {
        int codLivroID = Integer.parseInt(args.getArgs2());
        sistema.consultarLivro(codLivroID);
    }
}