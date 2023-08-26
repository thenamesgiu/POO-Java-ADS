package secondpoo;

import java.util.UUID;
import javax.swing.JOptionPane;

public class SecondPOO {

    public static void main(String[] args) {
        Curso curso = new Curso(UUID.randomUUID());
        
        curso.setNome("ADS");
        curso.setDuracao(2);
        
        
        JOptionPane.showMessageDialog(null, curso.imprimir());
    }
    
}
