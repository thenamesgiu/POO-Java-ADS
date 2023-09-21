/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulasete;

import javax.swing.JOptionPane;

/**
 *
 * @author anagi
 */
public class AulaSete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando cursos
        Curso c1 = new Curso(1, 2400, "ADS");
        Curso c2 = new Curso(2, 3800, "Engenharia");
        
        //Alunos de ADS
        Aluno a1 = new Aluno("0001", "Rafael");
        c1.inserirAluno(a1);
        a1 = new Aluno ("0002", "José");
        c1.inserirAluno(a1);
        
        //Alunos de Engenharia
        a1 = new Aluno("0003", "Maria");
        c2.inserirAluno(a1);
        a1 = new Aluno("0004", "Euuu");
        c2.inserirAluno(a1);
        
        //Mostrando dados dos cursos
        JOptionPane.showMessageDialog(null, c1.imprimirCompleto());
        JOptionPane.showMessageDialog(null, c2.imprimirCompleto());
    }
    
}
