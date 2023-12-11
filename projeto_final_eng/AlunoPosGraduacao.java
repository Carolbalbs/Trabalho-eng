package projeto_final_eng;

public class AlunoPosGraduacao extends Usuario {
    public AlunoPosGraduacao(String nome, int codID) {
        super(nome, codID);
    }

    @Override
    public int getMaxReservas() {
        return 4;
    }

    @Override
    public int getTempoMaximoEmprestimo() {
        return 4;
    }

}
