package tarefacinco;

public class Retangulo extends FormaGeometrica{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return largura * altura;
    }
    
    @Override
    public String toString(){
        return "Área do retângulo: " + calcularArea();
    }
    
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
