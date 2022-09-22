package br.com.unipar.interfaceeabstracao;

import java.util.Date;
import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aluno p = new Aluno();
        p.setNome("Kauã");
        p.setId(10);
        p.setRegistroAcademico("00225419");
        p.setDtNasc(new Date());
        
        JOptionPane.showMessageDialog(null, p.retornaDados());
    }

}
