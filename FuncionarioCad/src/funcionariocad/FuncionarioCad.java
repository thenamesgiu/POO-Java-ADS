package funcionariocad;

public class FuncionarioCad {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora, qtdeHora, salario, valorDesconto;
    
    //Construtor
    public FuncionarioCad(){
        
    }
    
    public FuncionarioCad(int cracha, String nome,char tipoVinculo, float valorHora, float qtdeHora, float salario, float valorDesconto){
       this.cracha = cracha;
       this.nome = nome;
       this.tipoVinculo = tipoVinculo;
       this.valorHora = valorHora;
       this.qtdeHora = qtdeHora;
       this.salario = salario;
       this.valorDesconto = valorDesconto;
    }
    
    //Set
    public void setCracha(int cracha){
        this.cracha = cracha;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTipoVinculo(char tipoVinculo){
        this.tipoVinculo = tipoVinculo;
    }
    
    public void setValorHora(float valorHora){
        this.valorHora = valorHora;
    }
    
    public void setQtdeHora(float qtdeHora){
        this.qtdeHora = qtdeHora;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public void setValorDesconto(float valorDesconto){
        this.valorDesconto = valorDesconto;
    }
    
    
    //Get
    public int getCracha(){
        return this.cracha;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public char getTipoVinculo(){
        return this.tipoVinculo;
    }
    
    public float getValorHora(){
        return this.valorHora;
    }
    
    public float getQtdeHora(){
        return this.qtdeHora;
    }
    
    public float getSalario(){
        return this.salario;
    }
    
    public float getValorDesconto(){
        return this.valorDesconto;
    }
    
    
    //Método com regra para calcular valor do salário
    public float calcularValorSalario(){
      
        if (tipoVinculo == 'H'){
            return valorHora* qtdeHora - valorDesconto;
        }
        else{
            return salario - valorDesconto;
        }
    }
    
    public float mostrarSalario(){
        
        if (tipoVinculo == 'H'){
            return valorHora* qtdeHora;
        }
        else{
            return salario;
        }
    }
    
    //Imprimir
    public String imprimir(){
        return "Crachá: " + getCracha() + "\nNome: " + getNome() + "\nTipo de vínculo: " + getTipoVinculo() + "\nSalário: " + mostrarSalario()+ "\nDesconto: " + getValorDesconto()+ "\nValor a receber: " + calcularValorSalario();
    }
}
