package projeto_final_eng;

public class RealizaEmprestimo {
	
	public void realizarEmprestimo(int codID, int codLivroID) {
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
	
	IVerificadorEmprestimo verificador = usuario.getVerificador();
	
	if (verificador.verificarPossibilidadeEmprestimo(livro, usuario)) {
		for (Exemplar exemplarAtual : livro.getExemplares()) {
			if (exemplarAtual.isDisponibilidade()) {
				exemplarAtual.setDisponibilidade(false);
				Emprestimo emprestimo = FabricaDeImpressoes.criarEmprestimo(exemplarAtual, usuario);
				exemplarAtual.setEmprestimoAtual(emprestimo);
				usuario.getEmprestimos().add(emprestimo);
				
				for (Reserva reservaAtual : livro.getReservasAtuais()) {
					if (reservaAtual.getUsuario().getCodigo().equals(usuario.getCodigo())) {
						livro.getReservasAtuais().remove(reservaAtual);
						break;
					}
				}
				
				for (Reserva reservaAtual : usuario.getReservas()) {
					if (reservaAtual.getLivro().getCodLivro().equals(codLivroID)) {
						usuario.getReservas().add(reservaAtual);
						usuario.getReservas().remove(reservaAtual);
						break;
					}
				}
				
				FabricaDeImpressoes.sucessoEmprestimo(usuario, livro);
				break;
			}
		}
	}
	
	}
}
