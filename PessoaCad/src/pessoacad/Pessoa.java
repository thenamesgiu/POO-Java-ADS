package pessoacad;

public class Pessoa {
private String cpf;
    private String nome;
    private char sexo;
    private int idade;
    
    //Construtor
    public Pessoa(){
        
    }
    
    public Pessoa(String cpf, String nome, char sexo, int idade){
       this.cpf = cpf;
       this.nome = nome;
       this.sexo = sexo;
       this.idade = idade;
    }
    
    //Set
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    //Get
    public String getCPF(){
        return this.cpf;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    //Imprimir
    public String imprimir(){
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + " ano(s)\nCPF: " + getCPF() + "\nSexo: " + getSexo();
    }
  
    
}
