/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula9;

/**
 *
 * @author aluno
 */
public class imovel {
    private int codigo;
    private String endereco;
    private double valor;

    //COnstrutores
    public imovel() {
    }

    public imovel(int codigo, String endereco, double valor) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.valor = valor;
    }

    //GET
    public int getCodigo() {
        return codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    //SET
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public double calcularValorImovel(){
        return valor;
    }
    
}
