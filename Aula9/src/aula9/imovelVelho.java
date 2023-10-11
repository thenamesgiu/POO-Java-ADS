/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula9;

/**
 *
 * @author aluno
 */
public class imovelVelho extends imovel {
    private double valorDesconto;

    public imovelVelho() {
    }

    public imovelVelho(double valorDesconto, int codigo, String endereco, double valor) {
        super(codigo, endereco, valor);
        this.valorDesconto = valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nValor" + calcularValorImovel();
    }
    
    
    @Override
    public double calcularValorImovel(){
        return getValor() - valorDesconto;
    }
}
