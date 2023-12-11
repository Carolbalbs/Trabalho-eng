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
	private
	private
	private
	private
	private
	private
	private
	
	// Nessa classe voce precisará chamar o metodo que implementou a regra de negocio
	//     EXEMPLO:
	// private private EmprestimoService emprestimoService;
	public SistemaBiblioteca() {
	 // this.emprestimoService = new EmprestimoService();
   	 this. = FabricaDeInstancia.();
     this. = FabricaDeInstancia.();
     this. = FabricaDeInstancia.();
   	 this. = FabricaDeInstancia.();
     this. = FabricaDeInstancia.();
     this. = FabricaDeInstancia.();
   	 this. = FabricaDeInstancia.();
     this. = FabricaDeInstancia.();
     this. = FabricaDeInstancia.();
	}

//	    public void realizarEmprestimo(int userId, int livroId) {
//	        emprestimoService.realizarEmprestimo(userId, livroId);
//	    }
   
    public void realizarEmprestimo(int codID, int codLivroID) {
       
    }

    public void devolverLivro(int codID, int codLivroID) {
       
    }

    public void realizarReserva(int codID, int codLivroID) {
        
    }

    public void adicionarObservador(int codID, int codLivroID) {
        
    }

    public void consultarLivro(int codLivroID) {
       
    }

    public void consultarHistorico(int codID) {
        
    }

    public int ativarNotificacoes(int codLivroID) {
    	  notificacoes.put(codLivroID, notificacoes.getOrDefault(codLivroID, 0) + 1);
    }


    public void hitoricoBiblioteca(int codID){
    	
    }
    
    public void  buscarExemplar(int codLivroID) {
    	
    }
    public void sairDoSistema() {
        
    } 
}
