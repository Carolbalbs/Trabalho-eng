package projeto_final_eng;

public class CommandFazerReserva implements ICommand {
    private SistemaBiblioteca sistema;
  

    @Override
    public void execute(CarregarArgs args) {
        int codID = args.getArgs1();
        int codLivroID = args.getArgs2();
        sistema.realizarReserva(codID, codLivroID);
    }
}