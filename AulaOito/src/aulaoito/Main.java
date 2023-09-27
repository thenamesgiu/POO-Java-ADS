/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaoito;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author anagi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
        
        int opc = 0;
        String nomeRazao, cpfCnpj, email, celular;
        
        while(opc !=3){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar\n2- Mostrar todos\n3 - Sair"));
            
            switch(opc){
                case 1:
                    opc = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo:\n1 - Física\n2 - Jurídica"));
                    
                    if (opc == 1){
                        nomeRazao = JOptionPane.showInputDialog("Nome: ");
                        cpfCnpj = JOptionPane.showInputDialog("CPF: ");
                        email = JOptionPane.showInputDialog("E-mail: ");
                        celular = JOptionPane.showInputDialog("Celular: ");
                        listaPessoa.add(new PessoaFisica(nomeRazao, cpfCnpj, email, celular));
                    }
                    else if (opc == 2){
                        nomeRazao = JOptionPane.showInputDialog("Razão Social: ");
                        cpfCnpj = JOptionPane.showInputDialog("CNPJ: ");
                        email = JOptionPane.showInputDialog("E-mail: ");
                        celular = JOptionPane.showInputDialog("Celular: ");
                        listaPessoa.add(new PessoaFisica(nomeRazao, cpfCnpj, email, celular));
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                        break;
                    }
                    break;
                case 2: 
                    String msg = "";
                    
                    for (Pessoa p: listaPessoa){
                        if( p instanceof PessoaFisica){
                            msg += ((PessoaFisica) p).imprimir() + "\n-------------------\n";
                        }
                        else{
                            msg += ((PessoaJuridica) p).imprimir() + "\n-------------------\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 3: 
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
    }
    
}
