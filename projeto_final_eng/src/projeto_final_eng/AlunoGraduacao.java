package projeto_final_eng;

public class AlunoGraduacao extends Usuario {

	public AlunoGraduacao(String nome, int codID) {
		super(nome, codID);
		
	}
    @Override
    public int getMaxReservas() {
        return 3;
    }

    @Override
    public int getTempoMaximoEmprestimo() {
        return 3; 
    }
}