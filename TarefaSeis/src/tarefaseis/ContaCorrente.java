package tarefaseis;

public class ContaCorrente {
    private double valor;
    private static double VALORTAXA;

    public ContaCorrente() {
    }

    public ContaCorrente(double valor) {
        this.valor = valor;
    }
    
    //Valor monetário
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

    public static double getVALORTAXA() {
        return VALORTAXA;
    }

    public static void setVALORTAXA(double VALORTAXA) {
        ContaCorrente.VALORTAXA = VALORTAXA;
    }

    public double imprimir(){
        return valor - (valor * (VALORTAXA / 100.0));
    }
}
