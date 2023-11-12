package tarefaseis;

public class ContaPoupanca {
    private double valor;
    private static double VALORTAXA;

    public ContaPoupanca() {
    }

    public ContaPoupanca(double valor) {
        this.valor = valor;
    }
    
    //Valor monetário - static
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    //Static
    public static double getVALORTAXA() {
        return VALORTAXA;
    }

    public static void setVALORTAXA(double VALORTAXA) {
        ContaPoupanca.VALORTAXA = VALORTAXA;
    }
    
    public double imprimir(){
        return (valor - (valor *((VALORTAXA*1.5)/100.0)));
    }
}
