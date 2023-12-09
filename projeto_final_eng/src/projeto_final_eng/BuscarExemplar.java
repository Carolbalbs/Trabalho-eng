package projeto_final_eng;

public class BuscarExemplar {
	  public Exemplar bucscaExemplar() { 
		  
		  Exemplar currentExemplar = null;
      for (int i = 0; i < Livro.exemplares.size(); i++) {
          if (Livro.exemplares.get(i).isEmprestado()) {
              currentExemplar = Livro.exemplares.get(i);
          }
          
      }
      return currentExemplar;
  }
}
