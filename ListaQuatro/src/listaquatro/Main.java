package listaquatro;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        int opc = 0;
        String ra, nome, curso, ano;
       
        
        while(opc != 3){
            opc = Integer.parseInt(JOptionPane.
                    showInputDialog("1 - Inserir aluno\n"
                            + "2 - Exibir alunos\n"
                            + "3 - Sair"));
            switch (opc) {
                case 1: 
                    opc = Integer.parseInt(JOptionPane.
                            showInputDialog("Tipo:\n"
                                    + "1 - Pós-graduação\n"
                                    + "2 - Graduação"));
                    if(opc == 1){
                        ra = JOptionPane.showInputDialog("RA:");
                        nome = JOptionPane.showInputDialog("Nome:");
                        curso = JOptionPane.showInputDialog("Curso:");
                        ano = JOptionPane.showInputDialog("Ano de última conclusão:");
                        listaAlunos.add(new AlunoPosGraduacao(ra, nome, curso, ano));
                    }else{
                          ra = JOptionPane.showInputDialog("RA:");
                        nome = JOptionPane.showInputDialog("Nome:");
                        curso = JOptionPane.showInputDialog("Curso:");
                        ano = JOptionPane.showInputDialog("Ano de última conclusão:");
                        listaAlunos.add(new AlunoGraduacao(ra, nome, curso, ano));
                    }
                    break;
                    case 2:   
                        String msg = "";
                        for(Aluno i : listaAlunos){
                            if(i instanceof AlunoPosGraduacao){
                               msg += ((AlunoPosGraduacao) i).toString() 
                                       + "\n --------- \n";
                            }else{
                               msg += ((AlunoGraduacao) i).toString()
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