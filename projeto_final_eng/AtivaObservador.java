package projeto_final_eng;

public class AtivaObservador {

	public void adicionarObservador(int codID, int codLivroID) {
		
		Usuario usuario = this.encontrarUsuario(codID);
		
		if (usuario == null) {
			FabricaDeImpressoes.usuarioNaoEncontrado();
			return;
		}
		
		Livro livro = this.encontrarLivro(codLivroID);
		
		if (livro == null) {
			FabricaDeImpressoes.livroNaoEncontrado();
			return;
		}
		
		livro.registraObservador((IObservador) usuario);
		FabricaDeImpressoes.sucessoRegistroObservador(usuario, livro);
	}
}
