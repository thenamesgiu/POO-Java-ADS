package tarefacinco;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<FormaGeometrica> listaGeometria = new ArrayList<>();
        int opc = 0;
        double raio, largura, altura;
       
        
        while(opc != 3){
            opc = Integer.parseInt(JOptionPane.
                    showInputDialog("1 - Inserir e calcular área\n"
                            + "2 - Mostrar todas as formas inseridas\n"
                            + "3 - Sair"));
            switch (opc) {
                case 1: 
                    opc = Integer.parseInt(JOptionPane.
                            showInputDialog("Tipo:\n"
                                    + "1 - Círculo\n"
                                    + "2 - Retângulo"));
                    if(opc == 1){
                        raio = Double.parseDouble(JOptionPane.showInputDialog("Raio:"));

                        listaGeometria.add(new Circulo(raio));
                    }else{
                        largura = Double.parseDouble(JOptionPane.showInputDialog("Largura:"));
                        altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
                        listaGeometria.add(new Retangulo(largura, altura));
                    }
                    break;
                    case 2:   
                        String msg = "";
                        for(FormaGeometrica i : listaGeometria){
                            if(i instanceof Circulo){
                               msg += ((Circulo) i).toString() 
                                       + "\n --------- \n";
                            }else{
                               msg += ((Retangulo) i).toString()
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
