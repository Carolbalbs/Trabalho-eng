package projeto_final_eng;

public class ConsultarLivroCommand implements Command {

    public ConsultarLivro(SistemaBiblioteca sistemaBiblioteca, int codUsuario, int codLivro) {
        this.sistemaBiblioteca = sistemaBiblioteca;
        this.codUsuario = codUsuario;
        this.codLivro = codLivro;
    }

    @Override
    public void execute() {
        sistemaBiblioteca.devolverLivro(codUsuario, codLivro);
    }
}

}
