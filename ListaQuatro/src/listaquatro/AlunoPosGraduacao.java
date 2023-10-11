package listaquatro;

public class AlunoPosGraduacao extends Aluno {
    private String anoConclusaoGraduacao;

    //Construtores
    public AlunoPosGraduacao() {
    }

    public AlunoPosGraduacao(String ra, String nome, String curso, String anoConclusaoGraduacao) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }
    
    //toString
    @Override
    public String toString(){
        return super.toString() + "\nAno de graduação: " + anoConclusaoGraduacao;
    }
    
    //Get
    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }
    
    //Set
    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }
    
}
