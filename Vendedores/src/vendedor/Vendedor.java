
package vendedor;

public class Vendedor {

    private int codigo;
    private String nome;
    private double percentualComissao;

    //Construtores
    public Vendedor() {
    }

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }
    
    //Set

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    //Get

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }
    
   //Calcular comissão 
    
   public double calcularPagamentoComissao(double valorVenda){
       return (valorVenda * percentualComissao) / 100.0;
   }
   
   public double calcularPagamentoComissao(double valorVenda, double desconto){
       return calcularPagamentoComissao(valorVenda) - desconto;
   }
   
   //Imprimir
   public String imprimir (double valorVenda, double desconto){
       return "Código: " + codigo + "\nNome: " + nome + "\nValor Venda: " + valorVenda + "\n% Comissao: " + percentualComissao + "\nDesconto: " + desconto + "\nValor a Pagar: " + calcularPagamentoComissao(valorVenda, desconto);
   }
   
    
}
