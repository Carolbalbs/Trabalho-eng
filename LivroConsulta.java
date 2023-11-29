package segregacao_interface.livro_consulta;

import java.time.LocalDateTime;

import segregacao_interface.livro.ILivro;

public class LivroConsulta implements ILivro {
    public String idItemBiblioteca;
    public String titulo;
    public String autor;
    public int numeroPaginas;

	public String getIdItemBiblioteca() {
		return idItemBiblioteca;
	}

	public void setIdItemBiblioteca(String idItemBiblioteca) {
		this.idItemBiblioteca = idItemBiblioteca;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	

	public int getNumeroPaginas() {
		return 0;
		
		
	};
	public void setNumeroPaginas(int numeroPaginas) {
		
	};

}
