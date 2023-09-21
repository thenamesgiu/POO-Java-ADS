package aulasete;


public class Aluno {

    private String ra, nome;

    public Aluno() {
    }

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    //SET
    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //GET
    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String imprimir(){
        return ra + " - " + nome;
    }
}
