package listaquatro;

public class AlunoGraduacao extends Aluno{
    private String anoConclusaoEnsinoMedio;

    //Construtores
    public AlunoGraduacao() {
    }

    public AlunoGraduacao(String ra, String nome, String curso, String anoConclusaoEnsinoMedio) {
        super(ra, nome, curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }
    
    //toString
    @Override
    public String toString(){
        return super.toString() + "\nAno de conclusão EM: " + anoConclusaoEnsinoMedio;
    }
   
    //Get
    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }
    
    //Set
    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }
}
