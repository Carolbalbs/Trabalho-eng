package projeto_final_eng;

import java.util.ArrayList;
import java.util.List;

public class Livro implements ISubject{
	private String titulo;
	private String editora;
	private int codLivroID;
	private int edicao;
	static ArrayList<Exemplar> exemplares;

	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getCodLivro() {
		return codLivroID;
	}
	public void setCodLivro(int codLivro) {
		this.codLivroID = codLivro;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public List<Exemplar> getExemplares() {
		return exemplares;
	}
	public void setExemplares(ArrayList<Exemplar> exemplares) {
		Livro.exemplares = exemplares;
	}
	public ArrayList<Exemplar> getAllExemplares() {
	        return exemplares;
	    }
	@Override
	public void registraObservador(IObservador observador) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removerObservador(IObservador observador) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void notificarObservadores() {
		// TODO Auto-generated method stub
		
	}
	public List<Exemplar> getReservasAtuais() {
		// TODO Auto-generated method stub
		return null;
	}
}
