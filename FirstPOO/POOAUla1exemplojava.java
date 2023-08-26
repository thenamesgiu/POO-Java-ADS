package pooaula1;
import javax.swing.JOptionPane;

public class POOAUla1 {

    public static void main(String[] args) {
        int opc = 0;
        String ra, nome, curso;
        Aluno aluno = null;
        
        while(opc != 3){
            opc = Integer.parseInt(
                JOptionPane.showInputDialog("Informe a opção:\n1 - Cadastrar\n2 - Mostrar\n3 - Sair"));
            
            switch(opc){
                case 1:
                        ra = JOptionPane.showInputDialog("RA:");
                        nome = JOptionPane.showInputDialog("Nome:");
                        curso = JOptionPane.showInputDialog("Curso:");
                        aluno = new Aluno();
                        aluno.setRa(ra);
                        aluno.setNome(nome);
                        aluno.setCurso(curso);
                        break;
                case 2:
                        if(aluno !=null){
                            JOptionPane.showMessageDialog(null, aluno.imprimir());
                        }
                        break;
                case 3:
                        break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
    
}
