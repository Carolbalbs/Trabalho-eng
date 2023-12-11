package projeto_final_eng;

import java.util.Date;

public class Emprestimo{

    public Date dataEmprestimo;
    public boolean statusEmprestimo;
	private Date dataDevolucaoRealizada;
	private Date dataDevolucaoPrevista;
	private Livro livro;
	
	

    public Emprestimo(Livro livro, Date dataEmprestimo, Date dataDevolucaoPrevista) {
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.statusEmprestimo = true;
    }

    public void devolverLivro(Date dataDevolucaoRealizada) {
        this.setDataDevolucaoRealizada(dataDevolucaoRealizada);
        this.statusEmprestimo = false;
    }
    
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public boolean isStatusEmprestimo() {
		return statusEmprestimo;
	}

	public void setStatusEmprestimo(boolean statusEmprestimo) {
		this.statusEmprestimo = statusEmprestimo;
	}

	public Date getDataDevolucaoRealizada() {
		return dataDevolucaoRealizada;
	}

	public void setDataDevolucaoRealizada(Date dataDevolucaoRealizada) {
		this.dataDevolucaoRealizada = dataDevolucaoRealizada;
	}

	public Date getDataDevolucaoPrevista() {
		return dataDevolucaoPrevista;
	}

	public void setDataDevolucaoPrevista(Date dataDevolucaoPrevista) {
		this.dataDevolucaoPrevista = dataDevolucaoPrevista;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
