/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula9;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<imovel> listaImoveis = new ArrayList<>();
        int opc = 0;
        double valorImovel;
        int codigo;
        String endereco;
        double valor;
        
        while(opc != 3){
            opc = Integer.parseInt(JOptionPane.
                    showInputDialog("1 - Cadastrar\n"
                            + "2 - Mostrar todos\n"
                            + "3 - Sair"));
            switch (opc) {
                case 1: 
                    opc = Integer.parseInt(JOptionPane.
                            showInputDialog("Tipo:\n"
                                    + "1 - Novo\n"
                                    + "2 - Velho"));
                    if(opc == 1){
                        valorImovel = Double.parseDouble(JOptionPane.showInputDialog("Valor adicional"));
                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Código"));
                        endereco = JOptionPane.showInputDialog("Endereço");
                        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
                        listaImoveis.add(new imovelNovo(valorImovel, codigo, endereco, valor));
                    }else{
                        valorImovel = Double.parseDouble(JOptionPane.showInputDialog("Valor adicional"));
                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Código"));
                        endereco = JOptionPane.showInputDialog("Endereço");
                        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
                        listaImoveis.add(new imovelVelho(valorImovel, codigo, endereco, valor));
                    }
                    break;
                    case 2:   
                        String msg = "";
                        for(imovel i : listaImoveis){
                            if(i instanceof imovelNovo){
                               msg += ((imovelNovo) i).calcularValorImovel() 
                                       + "\n --------- \n";
                            }else{
                               msg += ((imovelVelho) i).calcularValorImovel()
                                       +"\n -------- \n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, msg);
                    break;
                    case 3:                    
                    break;
                default:
           JOptionPane.showMessageDialog(null,"Opção Inválida");
            }
        }
        
    }
    
}