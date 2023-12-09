package projeto_final_eng;

import java.util.Date;

public class Exemplar {
	
    private boolean emprestado;
    private Date dataAquisicao;
   

    public Exemplar() {
        this.emprestado = false;
        this.setDataAquisicao(new Date()); 
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        emprestado = true;
    }

    public void devolver() {
        emprestado = false;
    }

	public Date getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(Date dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}
    public Exemplar  buscarExemplar() {
        Exemplar currentExemplar = null;
        for (int i = 0; i < Livro.exemplares.size(); i++) {
            if (Livro.exemplares.get(i).emprestado) {
                currentExemplar = Livro.exemplares.get(i);
            }
        }
        return currentExemplar;
    }
}
