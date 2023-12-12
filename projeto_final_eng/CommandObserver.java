package projeto_final_eng;

public class CommandObserver implements ICommand {
    private SistemaBiblioteca sistema;

	@Override
    public void execute(CarregarArgs args) {
        int codID = args.getArgs1();
        int codLivroID = args.getArgs2();
        sistema.realizarEmprestimo(codID, codLivroID);
    }
}

