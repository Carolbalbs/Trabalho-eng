package projeto_final_eng;

public class CommandDevolverlivro implements ICommand {
    private SistemaBiblioteca sistema;
    private CarregarArgs args;

    public CommandDevolverlivro() {
        this.sistema = sistema;
        this.args = args;
    }

    @Override
    public void execute(CarregarArgs args) {
        int codID = Integer.parseInt(args.getArgs1());
        int codLivroID = Integer.parseInt(args.getArgs2());
        sistema.realizarEmprestimo(codID, codLivroID);
    }

	
}