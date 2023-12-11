package projeto_final_eng;

public class DevolveLivro {
	public void devolverLivro(int codLivroID,Usuario usuario) {
		
	Livro livro = this.encontrarLivro(codLivroID);
	
	if (livro == null) {
		FabricaDeImpressoes.livroNaoEncontrado();
		return;
	}
	
	for (Emprestimo emprestimoAtual : usuario.getEmprestimos()) {
		if (emprestimoAtual.getExemplar().getLivro().getCodigo().equals(codLivroID)) {
			for (Exemplar exemplarAtual : livro.getExemplares()) {
				if (exemplarAtual.getCodigo().equals(emprestimoAtual.getExemplar().getCodigo())) {
					exemplarAtual.setDisponibilidade(true);
					exemplarAtual.setEmprestimoAtual(null);
					break;
				}
			}
			
			usuario.getEmprestimosPassados().add(emprestimoAtual);
			usuario.getEmprestimos().remove(emprestimoAtual);
			FabricaDeImpressoes.sucessoDevolucao(usuario, livro);
			return;
		}
	}
	
	FabricaDeImpressoes.naoPossuilivroEmprestimo(usuario, livro);
	}
	
	
}
