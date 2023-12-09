package projeto_final_eng;

import java.util.ArrayList;
import java.util.Date;

public class FabricaDeInstancia{
	
	public void SistemaBiblioteca() {
   	   new SistemaBiblioteca();
   }
    public static Usuario criarUsuario(String nome, int codID) {
        return new Usuario(nome, codID);
    }

    public static Professor criarProf(String nome, int codID) {
        return new Professor(nome, codID);
    }
    public static AlunoGraduacao criarAlunoGrad(String nome, int codID) {
        return new AlunoGraduacao(nome, codID);
    }
    public static AlunoPosGraduacao criarAlunoPosGrad(String nome, int codID) {
        return new AlunoPosGraduacao(nome, codID);
    }

    public static Livro criarLivro(String titulo, String editora, int codLivro, int edicao) {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setEditora(editora);
        livro.setCodLivro(codLivro);
        livro.setEdicao(edicao);
        livro.setExemplares(new ArrayList<>()); 
        return livro;
    }

    public static Exemplar criarExemplar() {
        return new Exemplar();
    }
    public static Reserva criarReserva(Livro livro, Date data, Usuario codID) {
        return new Reserva(livro, data, codID);
    }

    public static Emprestimo criarEmprestimo(Livro livro, Date dataEmprestimo, Date dataDevolucaoPrevista) {
        return new Emprestimo(livro, dataEmprestimo, dataDevolucaoPrevista);
    }

}