package secondpoo;

import java.util.UUID;

public class Curso {
    private String nome;
    private int duracao;
    private UUID codigo;
    
    public Curso(UUID codigo){
        this.codigo = codigo;
    }
    
    public Curso(){
        
    }
    
    public Curso(UUID codigo, String nome, int duracao){
        this(codigo);
        this.nome = nome;
        this.duracao = duracao;
        
    }
    //SET
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public void setCode(UUID codigo){
        this.codigo = codigo;
    }
    
    //GET
    public String getNome(){
        return this.nome;
    }
    
    public int getDuracao(){
        return this.duracao;
    }
    
    public UUID getCode(){
        return this.codigo;
    }
    
    //Imprimir
    public String imprimir(){
        return "Nome: " + getNome() + "\nDuracao: " + getDuracao() + " ano(s)\nCodigo: " + getCode();
    }
}
