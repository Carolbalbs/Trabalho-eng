package projeto_final_eng;

public class ConsultaLivro {
	public void consultarLivro(int codLivroID){
		Livro livro = this.encontrarLivro(codLivroID);
	
	if (livro == null) {
		FabricaDeImpressoes.livroNaoEncontrado();
		return;
	}
	
	FabricaDeImpressoes.consultaLivro(livro);
	
		}
	}
