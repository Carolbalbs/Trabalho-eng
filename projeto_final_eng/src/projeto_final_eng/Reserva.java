package projeto_final_eng;

import java.util.Date;

public class Reserva {
	
	  
	   public Date dataReserva;
	   public Usuario codID;
	   private Livro Livro;

	   public Reserva(Livro livro, Date data, Usuario codID){
	    this.Livro = livro;
	    this.codID = codID;
	    dataReserva = data;
	  }
	   
	   public Date getDataReserva() {
		return dataReserva;
	}

	   public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	   public void reservarLivro(Livro livroReserva) {
		   
			
	   }

	public Livro getLivro() {
		return Livro;
	}

	public void setLivro(Livro livro) {
		Livro = livro;
	}

    
}
