package aulasete;

import java.util.ArrayList;


public class Curso {
    private int codigo, cargaHoraria;
    private String nome;
    private ArrayList<Aluno> alunos;
   
    //CONSTRUTORES
    public Curso(){
        alunos = new ArrayList<>();
    }

    public Curso(int codigo, int cargaHoraria, String nome) {
        this();
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
    }
    
    //MÉTODO DE INSERÇÃO
    public void inserirAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    //MÉTODO DE REMOÇÃO
    public void removerAluno(int index){
        alunos.remove(index);
    }

    //SET
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    //GET
    public int getCodigo() {
        return codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    
    
    //IMPRIMIR DADOS DO CURSO
    public String imprimir(){
        return "Código: " + codigo + " Nome: " + nome + " Carga horária: " + cargaHoraria;
    }
    
    //IMPRIMIR DADOS DO CURSO E ALUNOS
    public String imprimirCompleto(){
        String dados = imprimir() + "\nAlunos:\n";
        
        for(Aluno a: alunos){
            dados += a.imprimir() + "\n";
        }
        return dados;
    }
}
