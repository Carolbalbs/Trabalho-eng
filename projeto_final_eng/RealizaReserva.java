package projeto_final_eng;

import java.util.Date;

public class RealizaReserva {
	public void realizarReserva(int codLivroID, int codID) {
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
	
	if (usuario.getReservas().size() <= 2) {
		Date  data;
		Reserva reserva = FabricaDeInstancia.criarReserva(livro, data, usuario);
		livro.getReservasAtuais().add(reserva);
		usuario.getReservas().add(reserva);
		
		if (livro.getReservasAtuais().size() >= 2) {
			livro.notificarObservadores();
		}
		
		FabricaDeImpressoes.sucessoReserva(usuario, livro);
	} else {
		FabricaDeImpressoes.limiteReserva(usuario, livro);
		}
	}	
}
