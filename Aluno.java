package br.com.unipar.interfaceeabstracao;

/**
 *
 * @author kauah
 */
public class Aluno extends Pessoa {

    private String registroAcademico;

    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    @Override
    public String retornaDados() {

        return "Nome: " + getNome() + "\n Registro Academico: " + this.registroAcademico;
    }

}
