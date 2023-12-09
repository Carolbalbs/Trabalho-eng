package projeto_final_eng;

import java.util.ArrayList;

public interface IUsuario{
	public int getCodID();
	
    public ArrayList<Emprestimo> getEmprestimos();

    public ArrayList<Reserva> getReservas();
}
