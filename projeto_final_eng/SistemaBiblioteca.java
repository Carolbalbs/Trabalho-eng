package projeto_final_eng;

import java.util.HashMap;
import java.util.Map;

public class SistemaBiblioteca {
	public static SistemaBiblioteca getInstancia() {
	
	        if (instancia == null) {
	            instancia = new SistemaBiblioteca();
	        }
	        return instancia;
	    }

    private static SistemaBiblioteca instancia;
    private Map<Integer, Integer> notificacoes = new HashMap<>();
	private RealizaReserva reserva;
	private RealizaEmprestimo empresta;
	private DevolveLivro devolve;
	private	ConsultaLivro consulta;
	private ConsultaHistorico historico;
	private AtivaObservador observa;
	
	

	public SistemaBiblioteca() {
	 
   	 this.reserva = FabricaDeInstancia.reservar();
   	 this.empresta = FabricaDeInstancia.emprestar();
  	 this.devolve = FabricaDeInstancia.devolver();
  	 this.consulta = FabricaDeInstancia.consultar();
 	 this.historico = FabricaDeInstancia.historicoUser();
  	 this.observa = FabricaDeInstancia.observer();
	}

   
    public void realizarEmprestimo(int codID, int codLivroID) {
       
    	empresta.realizarEmprestimo(codID, codLivroID);
    }
    
    public void realizarReserva(int codID, int codLivroID) {
        
    	reserva.realizarReserva(codLivroID, codID);
    }
    
    public void devolverLivro(int codID, int codLivroID) {
       devolve.devolverLivro(codLivroID, null);
    	
    }
    
    public void consultarLivro(int codLivroID) {
    	
       consulta.consultarLivro(codLivroID);
    }
    
    public void adicionarObservador(int codID, int codLivroID) {
        observa.adicionarObservador(codID, codLivroID);
    	
    }
    public void consultarHistorico(Usuario codID) {
        historico.consultarHistorico(codID);
    }

    public void ativarNotificacoes(int codID) {
    	notificacoes.put(codID, notificacoes.getOrDefault(codID, 0) + 1);
    }
    public void iniciarSistema() {
        FabricaDeImpressoes.menuEntrada();
    } 
    public void sairDoSistema() {
        FabricaDeImpressoes.fimPrograma();
    } 
}
