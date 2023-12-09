package projeto_final_eng;


import java.util.HashMap;
import java.util.Map;

public class Professor extends Usuario implements IObservador {
    private Map<Integer, Integer> notificacoes; 
    public Professor(String nome, int codID) {
        super(nome, codID);
        this.notificacoes = new HashMap<>();
    }

    @Override
    public void receberAtualizacao() { 
        int contagemNotificacoes = notificacoes.getOrDefault(getCodID(), 0); 
        notificacoes.put(getCodID(), contagemNotificacoes + 1); 
    }
}
