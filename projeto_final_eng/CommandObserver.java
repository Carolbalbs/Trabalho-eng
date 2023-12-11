package projeto_final_eng;

public class CommandObserver implements ICommand {
    private SistemaBiblioteca sistema;
    private CarregarArgs args;

    public CommandObserver() {
		super();
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

