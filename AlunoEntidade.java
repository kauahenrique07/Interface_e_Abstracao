package br.com.unipar.interfaceeabstracao;

/**
 *
 * @author kauah
 */
public class AlunoEntidade implements IBasicEntidade{

    @Override
    public void inserir(Object objeto) {
        
        String sql = "insert into aluno values ........";
        
    }

    @Override
    public void alterar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void consultar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void deletar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
