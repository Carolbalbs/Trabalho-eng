package projeto_final_eng;

import java.util.ArrayList;

public class Usuario implements IUsuario {
   protected int codID;
   protected String nome;
   protected ArrayList<Emprestimo> emprestimos;
   protected ArrayList<Reserva> reservas;

   public Usuario(String nome, int codID) {
       this.nome = nome;
       this.codID = codID;
       this.emprestimos = new ArrayList<>();
       this.reservas = new ArrayList<>();
   }

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodID() {
		return codID;
	}
	public void setCodID(int codID) {
		this.codID = codID;
	}
	public ArrayList<Emprestimo> getEmprestimos() {
		return emprestimos;
	}
	public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}
	public ArrayList<Reserva> getReservas() {
		return reservas;
	}
	public void setReservas(ArrayList<Reserva> reservas) {
		this.reservas = reservas;
	}

    protected int getMaxReservas() {
        return 3; 
    }

	public int getTempoMaximoEmprestimo() {
	
		return 0;
	}
	
   
}
