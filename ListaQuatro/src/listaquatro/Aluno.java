package listaquatro;

public class Aluno {
    private String ra;
    private String nome;
    private String curso;

    //Construtores
    public Aluno() {
        
    }
    
    public Aluno(String ra, String nome, String curso) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }
    
    //toString
    @Override
    public String toString(){
        return "RA: " + ra + "\nNome: " + nome + "\nCurso: " + curso;
    }
    
    //Getters
    
    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }
    
    //Setters

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
