package tarefacinco;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        return 3.14*Math.pow(raio, 2);
    }
    
    @Override
    public String toString(){
        return "Área do círculo: " + calcularArea();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    
}
