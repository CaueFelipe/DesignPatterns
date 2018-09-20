/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import Controles.Aluno;
import Controles.builders.AlunoBuilder;
import java.time.LocalDate;

/**
 *
 * @author caueo
 */
public class TestaAluno {
    
    public static void main(String args[]){
        
        LocalDate dn = LocalDate.of(2009, 2, 3);

        
        AlunoBuilder aluno1 = new AlunoBuilder();
            aluno1.comNome("Kauan Porto Felipe Siqueira")
            .comDataNascimento(dn)
            .comCep("08695450")
            .comLogradouro("Estrada do Renzi")
            .comNumero("928")
            .comBairro("Jd. Graziela")
            .comCidade("Suzano")
            .constroiAluno();        
    }    
    
}
