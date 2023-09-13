package aulaseis;

public class Funcionario {
    private int codigo;
    private String nome;
    private String setor;
    private String funcao;
    private double salario;

    //Construtor
    public Funcionario() {
        
    }

    public Funcionario(int codigo, String nome, String setor, String funcao, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
        this.salario = salario;
    }

    //Set
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Get
    public int getCodigo() {
        return codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getSetor() {
        return setor;
    }
    
    public String getFuncao() {
        return funcao;
    }
    
    public double getSalario() {
        return salario;
    }
    
    //Imprimir
    public String imprimir(){
        return "Código: " + codigo + "\nNome: " + nome + "\nSetor: " + setor + "\nFunção: " + funcao + "\nSalario: " + salario;
    }
    
}
