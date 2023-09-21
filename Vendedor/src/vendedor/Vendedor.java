package vendedor;

public class Vendedor {

    private int codigo;
    private String nome, funcao;
    private double salario;

    //Construtores
    public Vendedor() {
    }

    public Vendedor(int codigo, String nome, String funcao, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public Vendedor(int codigo) {
        this.codigo = codigo;
    }

    public Vendedor(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Vendedor(int codigo, String nome, String funcao) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcao = funcao;
    }

    //SET
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    //GET
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public double getSalario() {
        return salario;
    }
    
    //Cálculo do salário líquido
    public double calcularSalarioLiquido(double porcentagemComissao, double desconto){
        return salario + (salario * porcentagemComissao/100) - desconto;
    }
}
