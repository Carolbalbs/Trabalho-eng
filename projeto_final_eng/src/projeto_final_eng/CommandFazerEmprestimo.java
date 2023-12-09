package projeto_final_eng;

public class CommandFazerEmprestimo implements ICommand {
    private SistemaBiblioteca sistema;
    
    @Override
    public void execute(CarregarArgs args) {
        int codID = Integer.parseInt(args.getArgs1());
        int codLivroID = Integer.parseInt(args.getArgs2());
        sistema.realizarEmprestimo(codID, codLivroID);
    }
}