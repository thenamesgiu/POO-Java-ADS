/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula9;

/**
 *
 * @author aluno
 */
public class imovelNovo extends imovel{
    private double valorAdicional;

    public imovelNovo() {
    }

    public imovelNovo(double valorAdicional, int codigo, String endereco, double valor) {
        super(codigo, endereco, valor);
        this.valorAdicional = valorAdicional;
    }

    //Construtor
    public double getValorAdicional() {
        return valorAdicional;
    }

    //SET
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
        
    }
    
    //ToString
    @Override
    public String toString(){
        return super.toString() + "\nValor" + calcularValorImovel();
    }
    
    
    //Calcular valor
    @Override
    public double calcularValorImovel(){
        return getValor() + valorAdicional;
    }
    
    
    
}
