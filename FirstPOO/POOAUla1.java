package pooaula1;
import javax.swing.JOptionPane;

public class POOAUla1 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        
        aluno.setRa("123a4");
        aluno.setNome("Alo");
        aluno.setCurso("euuu");
        
        JOptionPane.showMessageDialog(null,aluno.imprimir());
                
                
        
        
    }
    
}
