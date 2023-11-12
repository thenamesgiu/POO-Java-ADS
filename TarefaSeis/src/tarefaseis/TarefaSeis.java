package tarefaseis;
import javax.swing.JOptionPane;

//Ana Giulia Moreira de Lima - 234984
//Pedro Henrique da Silva Tejon - 235001

public class TarefaSeis {
 
    public static void main(String[] args) {
        int opc = 0;
        String valor, valorT;
        
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        while(opc!=3){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Conferindo valor total\n1 - Conta corrente\n"+ "2 - Conta poupança\n"+ "3 - Sair"));
            switch (opc) {
                case 1: 
                    valor = JOptionPane.showInputDialog("Qual a quantia em dinheiro inserida na conta corrente?");
                    cc.setValor(Double.parseDouble(valor));
                    
                    valorT = JOptionPane.showInputDialog("Qual é a taxa do seu banco para a conta corrente?");
                    ContaCorrente.setVALORTAXA(Double.parseDouble(valorT));
                    
                    JOptionPane.showMessageDialog(null, "Valor inserido: " + valor + "\nTaxa: " + valorT + "\nValor total: " + cc.imprimir() );
                case 2:                    
                    valor = JOptionPane.showInputDialog("Qual a quantia em dinheiro inserida na conta corrente?");
                    cp.setValor(Double.parseDouble(valor));
                    
                    valorT = JOptionPane.showInputDialog("Qual é a taxa do seu banco para a conta corrente?");
                    ContaPoupanca.setVALORTAXA(Double.parseDouble(valorT));
                    
                    JOptionPane.showMessageDialog(null, "Valor inserido: " + valor + "\nTaxa: " + valorT + "\nValor total: " + cp.imprimir() );
                case 3:                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");
            }
        }
    }
    
}
