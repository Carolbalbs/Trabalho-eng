package projeto_final_eng;

public class FabricaDeImpressoes {
	public class Impressoes {
		public static void usuarioNaoEncontrado() {
			System.out.println("Código de usuário inválido!");
			System.out.println();
		}
		
		public static void livroNaoEncontrado() {
			System.out.println("Código de livro inválido!");
			System.out.println();
		}
		
		public static void emprestimoRealizado() {
			System.out.println("Empréstimo realizado com sucesso!");
		}
		
		public static void falhaEmprestimo() {
			System.out.println("Não foi possível efetuar o empréstimo!");
		}
		
		public static void falhaDevolucao() {
			System.out.println("Não foi possível efetuar a devolução!");
		}
		
		public static void devolucaoConcluida() {
			System.out.println("Sua Devolução foi efetuada com sucesso!");
		}
		
		public static void falhaReserva() {
			System.out.println("Não foi possível efetuar a reserva!");
		}
		
		public static void reservaRealizada() {
			System.out.println("Sua Reserva foi efetuada com sucesso!");
		}
		
		public static void registroObservadorEfetuado() {
			System.out.println("Observador registrado com sucesso!");
		}
		
		public static void sucessoEmprestimo(Usuario usuario, Livro livro) {
			System.out.println("Nome do usuário: " + usuario.getNome());
			System.out.println("Título do livro: " + livro.getTitulo());
			Impressoes.emprestimoRealizado();
			
		}
		
		public static void usuarioDevedor(Usuario usuario, Livro livro) {
			System.out.println("Nome do usuário: " + usuario.getNome());
			System.out.println("Título do livro: " + livro.getTitulo());
			Impressoes.falhaEmprestimo();
			System.out.println("Motivo: Usuário possui devolução de um livro em atraso.");
			
		}
		
		public static void exemplaresIndisponiveis(Usuario usuario, Livro livro) {
			System.out.println("Nome do usuário: " + usuario.getNome());
			System.out.println("Título do livro: " + livro.getTitulo());
			Impressoes.falhaEmprestimo();
			System.out.println("Motivo: Não existe exemplar do livro disponível.");
			
		}
		
		public static void limiteEmprestimo(Usuario usuario, Livro livro) {
			System.out.println("Nome do usuário: " + usuario.getNome());
			System.out.println("Título do livro: " + livro.getTitulo());
			Impressoes.falhaEmprestimo();
			System.out.println("Motivo: Usuário atingiu o seu limite de empréstimos.");
			
		}
		
		public static void emprestimoDuplicado(Usuario usuario, Livro livro) {
			System.out.println("Nome do usuário: " + usuario.getNome());
			System.out.println("Título do livro: " + livro.getTitulo());
			Impressoes.falhaEmprestimo();
			System.out.println("Motivo: Usuário já possui o livro em seus empréstimos.");
			
		}
		
		public static void totalmenteReservado(Usuario usuario, Livro livro) {
			System.out.println("Nome do usuário: " + usuario.getNome());
			System.out.println("Título do livro: " + livro.getTitulo());
			Impressoes.falhaEmprestimo();
			System.out.println("Motivo: Todos os exemplares estão reservados.");
	
		}
		
		public static void sucessoDevolucao(Usuario usuario, Livro livro) {
			System.out.println("Nome do usuário: " + usuario.getNome());
			System.out.println("Título do livro: " + livro.getTitulo());
			Impressoes.devolucaoConcluida();
			
		}
		
		public static void naoPossuilivroEmprestimo(Usuario usuario, Livro livro) {
			System.out.println("Nome do usuário: " + usuario.getNome());
			System.out.println("Título do livro: " + livro.getTitulo());
			Impressoes.falhaDevolucao();
			System.out.println("Motivo: Usuário não possui o livro em seus empréstimos.");
			System.out.println();
		}
		
		public static void sucessoReserva(Usuario usuario, Livro livro) {
			System.out.println("Nome do usuário: " + usuario.getNome());
			System.out.println("Título do livro: " + livro.getTitulo());
			Impressoes.reservaRealizada();
			
		}
		
		public static void limiteReserva(Usuario usuario, Livro livro) {
			System.out.println("Nome do usuário: " + usuario.getNome());
			System.out.println("Título do livro: " + livro.getTitulo());
			Impressoes.falhaReserva();
			System.out.println("Motivo: Usuário atingiu o seu limite de reservas.");
			
		}
		
		public static void sucessoRegistroObservador(Usuario usuario, Livro livro) {
			System.out.println("Nome do usuário: " + usuario.getNome());
			System.out.println("Título do livro: " + livro.getTitulo());
			Impressoes.registroObservadorEfetuado();
			
		}
		
		public static void consultaLivro(Reserva reserva) {
			System.out.println("Título do livro: " + reserva.getTitulo());
			System.out.println("Quantidade de reservas: " + reserva.getReservasAtuais().size());
			
			if (reserva.getReservasAtuais().size() > 0) {
				System.out.println("Nome dos usuários com reserva pendente para este livro: ");
				System.out.println();
				
				for (Reserva reservaAtual : reserva.getReservasAtuais()) {
					System.out.println("Nome do usuário: " + reservaAtual.getUsuario().getNome());
				}
			}
			
			System.out.println("Exemplares: ");
			System.out.println();
			
			for (Exemplar exemplarAtual : exemplar.getExemplares()) {
				System.out.println("Código: " + exemplarAtual.getCodigo());
				
				if (exemplarAtual.isDisponibilidade()) {
					System.out.println("Status: Disponível");
				} else {
					System.out.println("Status: Indisponível");
					System.out.println("Usuário em posse do exemplar: " + exemplarAtual.getEmprestimoAtual().getUsuario().getNome());
					String data = new SimpleDateFormat("dd/MM/yyyy").format(exemplarAtual.getEmprestimoAtual().getDate());
					System.out.println("Data do empréstimo: " + data);
					System.out.println("Tempo previsto para devolução: " + exemplarAtual.getEmprestimoAtual().getUsuario().getLimiteEmprestimo() + " dias");
				}
				
			}
		}
		
		public static void consultaUsuario(Usuario usuario) {
			System.out.println("Nome do usuário: " + usuario.getNome());
			System.out.println();
			
			if (usuario.getEmprestimos().size() > 0) {
				for (Emprestimo emprestimoAtual : usuario.getEmprestimos()) {
					System.out.println("Título do livro: " + emprestimoAtual.getExemplar().getLivro().getTitulo());
					String data = new SimpleDateFormat("dd/MM/yyyy").format(emprestimoAtual.getDate());
					System.out.println("Data do empréstimo: " + data);
					System.out.println("Status: Em curso");
					System.out.println("Tempo previsto para devolução: " + emprestimoAtual.getUsuario().getLimiteEmprestimo() + " dias");
					System.out.println();
				}
			} else {
				System.out.println("Usuário não possui empréstimos em curso");
				System.out.println();
			}
			
			if (usuario.getEmprestimosPassados().size() > 0) {
				for (Emprestimo emprestimoAtual : usuario.getEmprestimosPassados()) {
					System.out.println("Título do livro: " + emprestimoAtual.getExemplar().getLivro().getTitulo());
					String data = new SimpleDateFormat("dd/MM/yyyy").format(emprestimoAtual.getDate());
					System.out.println("Data do empréstimo: " + data);
					System.out.println("Status: Finalizado");
					System.out.println("Devolução já efetuada!");
			
				}
			} else {
				System.out.println("Usuário não possui empréstimos em curso");
			
			}
			
			if (usuario.getReservas().size() > 0) {
				for (Reserva reservaAtual : usuario.getReservas()) {
					System.out.println("Título do livro: " + reservaAtual.getLivro().getTitulo());
					String data = new SimpleDateFormat("dd/MM/yyyy").format(reservaAtual.getDate());
					System.out.println("Data da reserva: " + data);
					System.out.println("Status: Em curso");
					System.out.println();
				}
			} else {
				System.out.println("Usuário não possui reservas em curso");
				System.out.println();
			}
			
			if (usuario.getReservas().size() > 0) {
				for (Reserva reservaAtual : usuario.getReservasPassados()) {
					System.out.println("Título do livro: " + reservaAtual.getLivro().getTitulo());
					String data = new SimpleDateFormat("dd/MM/yyyy").format(reservaAtual.getDate());
					System.out.println("Data da reserva: " + data);
					System.out.println("Status: Finalizado");
					System.out.println();
				}
			} else {
				System.out.println("Usuário não possui reservas finalizadas");
				System.out.println();
			}
		}
		
		public static void consultaNotificacoes(Usuario usuario) {
			System.out.println("Nome do usuário: " + usuario.getNome());
			System.out.println("Quantidade de notifições: " + ((Professor) usuario).getNotificacoes());
			System.out.println();
		}
		 public void historicoAtividades() {
			 System.out.println("Histórico de Empréstimos e Reservas para o usuário " + Usuario.codID + ":");

			 System.out.println("\nEmpréstimos Finalizados:");
			 for (Emprestimo emprestimo : Usuario.emprestimos) {
			     if (!emprestimo.isStatusEmprestimo()) {
			         String dataDevolucao = "Realizada em " + emprestimo.getDataDevolucaoRealizada();

			         System.out.println("Livro: " + emprestimo.getLivro().getTitulo() +
			                            ", Data do Emprestimo: " + emprestimo.getDataEmprestimo() +
			                            ", Status: Finalizado" +
			                            ", " + dataDevolucao);
			     }
			 }

			 System.out.println("\nReservas Finalizadas:");
			 for (Reserva reserva : Usuario.reservas) {
			     String dataReserva = "Realizada em " + reserva.getDataReserva();

			     System.out.println("Livro: " + reserva.getLivro().getTitulo() +
			                        ", Data da Reserva: " + dataReserva);
			 }
		 }
		public static void fimPrograma() {
			System.out.println("Programa encerrado!");
		}
	}
}
